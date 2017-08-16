package com.simplemall.micro.serv.page.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplemall.micro.serv.common.bean.RestAPIResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "商品服务")
@RestController
@RequestMapping("/prd")
public class APIProductController {

	private Logger logger = LoggerFactory.getLogger(APIProductController.class);

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	LoadBalancerClient loandBalancerClient;

	@ApiOperation(value = "get product detail info")
	@RequestMapping(value = "{tid}", method = RequestMethod.POST)
	public RestAPIResult<String> getProductById(
			@ApiParam(value = "product id") @RequestParam(required = true) String prdId) {
		this.loandBalancerClient.choose("product-service");
		logger.info("begin invoke product service");
		restTemplate.getForEntity("", String.class).getBody();
		return null;
	}

}
