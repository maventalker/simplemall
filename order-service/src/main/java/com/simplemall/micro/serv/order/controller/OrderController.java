package com.simplemall.micro.serv.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.order.OrderDTO;
import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.micro.serv.order.service.IOrderService;

/**
 * 订单控制类
 * 
 * @author guooo
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	IOrderService orderService;

	/**
	 * 创建
	 * 
	 * @param orderJsonStr
	 * @return
	 */
	@RequestMapping(value = "create", method = {RequestMethod.POST,RequestMethod.GET})
	public String createOrder(String orderJsonStr) {
		boolean result = orderService.create(orderJsonStr);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}

	/**
	 * 查看订单，确保查看人与订单所有人为同一人
	 * 
	 * @param serialNo
	 * @param accountId
	 */
	@RequestMapping(value = "view", method = RequestMethod.POST)
	public OrderDTO viewOrder(@RequestParam(required = true) String serialNo,
			@RequestParam(required = true) String accountId,String jwtToken) {
		return orderService.view(serialNo, accountId);
	}

	/**
	 * 状态变更，主要供后台人员使用便于前端消费者跟踪订单状况
	 * 
	 * @param serialNo
	 * @param state
	 * @return
	 */
	@RequestMapping(value = "state/change", method = RequestMethod.POST)
	public Boolean changeOrderState(String serialNo, String payStatus,String orderStatus) {
		return orderService.changeOrderState(serialNo, payStatus,orderStatus);
	}
}
