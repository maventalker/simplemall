package com.simplemall.micro.serv.order.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.simplemall.micro.serv.common.util.SnowflakeIdWorker;
import com.simplemall.micro.serv.order.bean.OrderDTO;
import com.simplemall.micro.serv.order.bean.OrderInfo;
import com.simplemall.micro.serv.order.bean.OrderInfoCriteria;
import com.simplemall.micro.serv.order.bean.OrderProduct;
import com.simplemall.micro.serv.order.bean.OrderProductCriteria;
import com.simplemall.micro.serv.order.bean.OrderState;
import com.simplemall.micro.serv.order.bean.OrderStateCriteria;
import com.simplemall.micro.serv.order.mapper.OrderInfoMapper;
import com.simplemall.micro.serv.order.mapper.OrderProductMapper;
import com.simplemall.micro.serv.order.mapper.OrderStateMapper;
import com.simplemall.micro.serv.order.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	private Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	OrderInfoMapper orderInfoMapper;

	@Autowired
	OrderProductMapper orderProductMapper;

	@Autowired
	OrderStateMapper orderStateMapper;

	@Override
	public boolean create(String orderJsonStr) {
		JSONObject jsonObject = JSONObject.parseObject(orderJsonStr);

		OrderDTO orderDTO = JSONObject.toJavaObject(jsonObject, OrderDTO.class);
		long serialNo = SnowflakeIdWorker.generateSerialNos();
		orderDTO.getBaseInfo().setSerialNo(String.valueOf(serialNo));
		try {
			orderInfoMapper.insertSelective(orderDTO.getBaseInfo());
			// 服务测试时，只支持一个商品的订单
			orderProductMapper.insertSelective(orderDTO.getProducts().get(0));
			OrderState state = new OrderState();
			state.setSerialNo(String.valueOf(serialNo));
			state.setStatus("创建订单");
			orderStateMapper.insertSelective(state);
			logger.info("订单创建成功，订单号是{}", serialNo);
		} catch (Exception e) {
			logger.error("异常发生，{}", e);
		}
		return false;
	}

	@Override
	public OrderDTO view(String tid, String accountId) {
		OrderInfoCriteria orderInfoCriteria = new OrderInfoCriteria();
		orderInfoCriteria.createCriteria().andTidEqualTo(tid).andShippingAccountEqualTo(accountId);
		OrderInfo info = orderInfoMapper.selectByPrimaryKey(tid);

		OrderProductCriteria orderProductCriteria = new OrderProductCriteria();
		orderProductCriteria.createCriteria().andSerialNoEqualTo(tid);
		List<OrderProduct> products = orderProductMapper.selectByExample(orderProductCriteria);

		OrderStateCriteria orderStateCriteria = new OrderStateCriteria();
		orderStateCriteria.createCriteria().andSerialNoEqualTo(tid);
		List<OrderState> states = orderStateMapper.selectByExample(orderStateCriteria);
		OrderDTO dto = new OrderDTO();
		dto.setBaseInfo(info);
		dto.setProducts(products);
		dto.setStateChanges(states);
		return dto;
	}

	@Override
	public boolean changeOrderState(String tid, String state) {
		OrderState orderState = new OrderState();
		orderState.setSerialNo(tid);
		orderState.setStatus(state);
		int result = orderStateMapper.insertSelective(orderState);
		logger.info("{}订单状态变更，当前状态{}.",tid,state);
		return result > 0 ? true : false;
	}

}
