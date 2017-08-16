package com.simplemall.micro.serv.page.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.page.client.AccountFeignClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/mcs/acc")
@Api(value = "account rest api", tags = "用户接口")
public class APIAccountController {

	private Logger logger = LoggerFactory.getLogger(APIAccountController.class);

	@Autowired
	AccountFeignClient feignClient;

	@ApiOperation(value = "account login", notes = "")
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public RestAPIResult<String> login(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
			@ApiParam(value = "密码") @RequestParam(required = true) String password) {
		RestAPIResult<String> restAPIResult = feignClient.login(phone, password);
		logger.info("login result = {}", restAPIResult.getRespData());
		return restAPIResult;
	}
}
