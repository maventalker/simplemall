package com.simplemall.micro.serv.order.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.simplemall.micro.serv.common.bean.order.OrderDTO;
import com.simplemall.micro.serv.common.bean.order.OrderInfo;
import com.simplemall.micro.serv.common.bean.order.OrderInfoCriteria;
import com.simplemall.micro.serv.common.bean.order.OrderProduct;
import com.simplemall.micro.serv.common.bean.order.OrderProductCriteria;
import com.simplemall.micro.serv.common.bean.order.OrderState;
import com.simplemall.micro.serv.common.bean.order.OrderStateCriteria;
import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.micro.serv.common.util.SnowflakeIdWorker;
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
	// FIXME 增加事务支持
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
	public boolean create(String orderJsonStr) {
		JSONObject jsonObject = null;
		try {
			if (StringUtils.isEmpty(orderJsonStr)) {
				//mock data to generate order data
				orderJsonStr = assembleMockData();
			}
			jsonObject = JSONObject.parseObject(orderJsonStr);
		} catch (Exception exception) {
			logger.error("订单数据解析异常{}", exception);
		}

		OrderDTO orderDTO = JSONObject.toJavaObject(jsonObject, OrderDTO.class);
		long serialNo = SnowflakeIdWorker.generateSerialNos();
		orderDTO.getBaseInfo().setSerialNo(String.valueOf(serialNo));
		orderDTO.getBaseInfo().setStatus(SystemConstants.STATE.CREATE);
		try {
			orderInfoMapper.insertSelective(orderDTO.getBaseInfo());
			// 服务测试时，只支持一个商品的订单
			List<OrderProduct> orderProducts = orderDTO.getProducts();
			for (OrderProduct orderProduct : orderProducts) {
				orderProduct.setSerialNo(orderDTO.getBaseInfo().getTid());
			}
			orderProductMapper.insertSelective(orderDTO.getProducts().get(0));
			OrderState state = new OrderState();
			state.setSerialNo(orderDTO.getBaseInfo().getTid());
			state.setStatus(SystemConstants.STATE.CREATE);
			orderStateMapper.insertSelective(state);
			logger.info("订单创建成功，订单号是{}", serialNo);
			return true;
		} catch (Exception e) {
			logger.error("创建订单异常发生，{}", e);
		}
		return false;
	}

	private String assembleMockData() {
			OrderDTO orderDTO = new OrderDTO();
			//base info 
			OrderInfo info = new OrderInfo();
			info.setSerialNo(String.valueOf(SnowflakeIdWorker.generateSerialNos()));
			info.setPayStatus(SystemConstants.PAY_STATUS.UNPAY);
			info.setPayType(SystemConstants.PAY_TYPE.ALIPAY);
			info.setPostFee(BigDecimal.valueOf(23.45));
			info.setPostWay(SystemConstants.SHIP_WAY.FEDEX);
			info.setPrice(BigDecimal.valueOf(3400));
			info.setShippingAccount("Guooo");
			info.setShippingAddress("Tianxin District,ChangSha,China");
			info.setShippingPhone("17673738886");
			orderDTO.setBaseInfo(info);
			
			//product info
			OrderProduct product = new OrderProduct();
			product.setPrdName("一加手机5 (A5000) 8GB+128GB 星辰黑 全网通 双卡双待 移动联通电信4G手机");
			product.setPrdPrice(BigDecimal.valueOf(3400));
//			product.setSerialNo("");在添加工程中，自动添加进去
			product.setPrdQty(1);
			List<OrderProduct> products = new ArrayList<>();
			products.add(product);
			orderDTO.setProducts(products);
			
			return JSONObject.toJSONString(orderDTO);
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
	public boolean changeOrderState(String tid, String payStatus,String orderStatus) {
		OrderState orderState = new OrderState();
		orderState.setSerialNo(tid);
		orderState.setStatus(payStatus);
		int result = orderStateMapper.insertSelective(orderState);

		OrderInfo info = new OrderInfo();
		info.setTid(tid);
		info.setPayStatus(payStatus);
		info.setStatus(orderStatus);
		int updateResult = orderInfoMapper.updateByPrimaryKeySelective(info);
		logger.info("{}订单状态变更，当前状态{}.", tid, payStatus);
		return result + updateResult > 1 ? true : false;
	}

}
