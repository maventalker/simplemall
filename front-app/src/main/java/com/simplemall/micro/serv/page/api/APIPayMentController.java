package com.simplemall.micro.serv.page.api;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.constant.SystemConstants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "支付服务", tags = "支付服务接口")
@RestController
@RequestMapping("/payment")
public class APIPayMentController {

	private final static String PAY_SERVICE_URL = "http://PAYMENT-SERVICE:8082";

	private final static String ORDER_SERVICE_URL = "http://ORDER-SERVICE:8083";

	private final static String PAY_SERVICE = "PAYMENT-SERVICE";

	@Autowired
	LoadBalancerClient loadBalancerClient;

	@Autowired
	RestTemplate restTemplate;

	@ApiOperation(value = "支付")
	@RequestMapping(value = "pay", method = RequestMethod.POST)
	public RestAPIResult<Boolean> pay(@RequestParam("serialNo") String serialNo,
			@RequestParam("payType") String payType, @RequestParam("price") BigDecimal price) {
		this.loadBalancerClient.choose(PAY_SERVICE);
		RestAPIResult<Boolean> restAPIResult = new RestAPIResult<>();
		Map<String, Object> uriVariable = new HashMap<>();
		uriVariable.put("serialNo", serialNo);
		uriVariable.put("payType", payType);
		uriVariable.put("price", price);
		int payResult = restTemplate.getForObject(PAY_SERVICE_URL + "/payment/pay", Integer.class, uriVariable);
		if (SystemConstants.Code.success == payResult) {
			// notice order system to update order state
			Map<String, Object> uriNoticeVariable = new HashMap<>();
			uriVariable.put("serialNo", serialNo);
			uriVariable.put("state", SystemConstants.PAY_STATUS.PAID);
			int update = restTemplate.getForObject(ORDER_SERVICE_URL, Integer.class, uriNoticeVariable);

			if ((payResult+ update)<1) {
				restAPIResult = new RestAPIResult<>("支付失败，请稍后重试！");
			}
		}
		return restAPIResult;
	}
}
