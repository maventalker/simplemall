package com.simplemall.micro.serv.page.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.bean.order.OrderDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "订单服务", tags = "订单服务接口")
@RestController
@RequestMapping("/order")
public class APIOrderController {

	private final static String ORDER_SERVICE_URL = "http://ORDER-SERVICE:8083";

	private final static String ORDER_SERVICE = "ORDER-SERVICE";

	@Autowired
	LoadBalancerClient loadBalancerClient;

	@Autowired
	RestTemplate restTemplate;

	/**
	 * 创建订单
	 * 
	 * @param orderJsonStr
	 * @return
	 */
	@ApiOperation(value = "创建订单")
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String createOrder(@ApiParam(value = "订单json数据") @RequestParam String orderJsonStr) {
		this.loadBalancerClient.choose(ORDER_SERVICE);// 随机访问策略
		return restTemplate.getForObject(ORDER_SERVICE_URL + "/order/create?orderJsonStr={orderJsonStr}", String.class,
				orderJsonStr);

	}

	/**
	 * 查看订单
	 * 
	 * @param serialNo
	 * @param accountId
	 * @return
	 */
	@ApiOperation(value = "查看订单")
	@RequestMapping(value = "view", method = RequestMethod.POST)
	public RestAPIResult<OrderDTO> viewOrder(@RequestParam(required = true) String serialNo,
			@RequestParam(required = true) String accountId) {
		RestAPIResult<OrderDTO> restAPIResult = new RestAPIResult<>();
		this.loadBalancerClient.choose(ORDER_SERVICE);
		restAPIResult.setRespData(
				restTemplate.getForObject(ORDER_SERVICE_URL + "/order/view?serialNo={serialNo}&accountId={accountId}",
						OrderDTO.class, serialNo, accountId));
		return restAPIResult;
	}

	/**
	 * 订单状态变更
	 * 
	 * @param serialNo
	 * @param state
	 * @return
	 */
	@ApiOperation(value = "订单状态变更")
	@RequestMapping(value = "state/change", method = RequestMethod.POST)
	public RestAPIResult<OrderDTO> stateChange(@RequestParam(required = true) String serialNo,
			@RequestParam(required = true) String state) {
		RestAPIResult<OrderDTO> restAPIResult = new RestAPIResult<>();
		this.loadBalancerClient.choose(ORDER_SERVICE);
		restAPIResult.setRespData(
				restTemplate.getForObject(ORDER_SERVICE_URL + "/order/state/change?serialNo={serialNo}&state={state}",
						OrderDTO.class, serialNo, state));
		return restAPIResult;
	}

}
