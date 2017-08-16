package com.simplemall.micro.serv.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.micro.serv.order.bean.OrderDTO;
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
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public RestAPIResult<String> createOrder(String orderJsonStr) {
		RestAPIResult<String> restAPIResult = new RestAPIResult<>();
		boolean result = orderService.create(orderJsonStr);
		restAPIResult.setRespData(result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL);
		return restAPIResult;
	}

	/**
	 * 查看订单，确保查看人与订单所有人为同一人
	 * 
	 * @param serialNo
	 * @param accountId
	 */
	@RequestMapping(value = "view", method = RequestMethod.POST)
	public RestAPIResult<OrderDTO> viewOrder(@RequestParam(required = true) String serialNo,
			@RequestParam(required = true) String accountId) {
		RestAPIResult<OrderDTO> restAPIResult = new RestAPIResult<>();
		OrderDTO dto = orderService.view(serialNo, accountId);
		restAPIResult.setRespData(dto);
		return restAPIResult;
	}

	/**
	 * 状态变更
	 * 
	 * @param serialNo
	 * @param state
	 * @return
	 */
	@RequestMapping(value = "state/change", method = RequestMethod.POST)
	public RestAPIResult<Boolean> changeOrderState(String serialNo, String state) {
		RestAPIResult<Boolean> restAPIResult = new RestAPIResult<>();
		boolean result = orderService.changeOrderState(serialNo, state);
		restAPIResult.setRespData(result);
		return restAPIResult;
	}
}
