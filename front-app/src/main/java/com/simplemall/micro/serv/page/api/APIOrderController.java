package com.simplemall.micro.serv.page.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.bean.order.OrderDTO;
import com.simplemall.micro.serv.common.constant.SystemConstants;

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
	 * 创建订单，json数据可参照order-service模块中的提供的测试方法中产生
	 * 
	 * @param orderJsonStr
	 * @return
	 */
	@ApiOperation(value = "创建订单")
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public RestAPIResult<String> createOrder(@ApiParam(value = "订单json数据") @RequestParam String orderJsonStr,
			String accessToken) {
		this.loadBalancerClient.choose(ORDER_SERVICE);// 随机访问策略
		Map<String, Object> uriVariables = new HashMap<String, Object>();
		// get方式，建议采用post方式传输数据
		String result = restTemplate.getForObject(ORDER_SERVICE_URL + "/order/create", String.class, uriVariables);
		if (SystemConstants.Code.SUCCESS.equals(result)) {
			return new RestAPIResult<String>();
		}
		return new RestAPIResult<String>("订单创建失败！");

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
			@RequestParam(required = true) String accountId, String accessToken) {
		RestAPIResult<OrderDTO> restAPIResult = new RestAPIResult<>();
		this.loadBalancerClient.choose(ORDER_SERVICE);
		MultiValueMap<String, Object> uriVariables = new LinkedMultiValueMap<String, Object>();
		uriVariables.add("serialNo", serialNo);
		uriVariables.add("accountId", accountId);
		// post方式调用服务
		OrderDTO entity = restTemplate.postForObject(ORDER_SERVICE_URL + "/order/view", uriVariables, OrderDTO.class);
		restAPIResult.setRespData(entity);
		return restAPIResult;
	}

	/**
	 * 订单状态变更，由后端发起变更，前端不建议使用
	 * 
	 * @param serialNo
	 * @param state
	 * @return
	 */
	@RequestMapping(value = "state/change", method = RequestMethod.POST)
	public RestAPIResult<OrderDTO> stateChange(@RequestParam(required = true) String serialNo,
			@RequestParam(required = true) String state) {
		RestAPIResult<OrderDTO> restAPIResult = new RestAPIResult<>();
		this.loadBalancerClient.choose(ORDER_SERVICE);
		// get方式调用后端服务
		restAPIResult.setRespData(
				restTemplate.getForObject(ORDER_SERVICE_URL + "/order/state/change?serialNo={serialNo}&state={state}",
						OrderDTO.class, serialNo, state));
		return restAPIResult;
	}

}
