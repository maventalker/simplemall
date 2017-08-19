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

@Api(value="订单服务",tags="订单服务接口")
@RestController
@RequestMapping("/order")
public class APIOrderController {

	@Autowired
	LoadBalancerClient loadBalancerClient;

	@Autowired
	RestTemplate restTemplate;

	@ApiOperation(value = "创建订单")
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String createOrder(@ApiParam(value = "订单json数据") @RequestParam String orderJsonStr) {
		this.loadBalancerClient.choose("ORDER-SERVICE");// 随机访问策略
		String url = "http://ORDER-SERVICE:8083/order/create?orderJsonStr={orderJsonStr}";
		return restTemplate.getForObject(url, String.class, orderJsonStr);

	}
	
	@ApiOperation(value = "查看订单")
	@RequestMapping(value = "view",method = RequestMethod.POST)
	public RestAPIResult<OrderDTO> viewOrder(@RequestParam(required = true) String serialNo,
			@RequestParam(required = true) String accountId){
		RestAPIResult<OrderDTO> restAPIResult = new RestAPIResult<>();
		this.loadBalancerClient.choose("ORDER-SERVICE");
		restAPIResult.setRespData(restTemplate.getForEntity("", OrderDTO.class).getBody());
		return restAPIResult;
	}
	
	
}
