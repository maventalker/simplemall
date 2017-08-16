package com.simplemall.micro.serv.page.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.RestAPIResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/mcs/acc")
@Api(value = "account rest api", tags = "用户接口")
public class APIAccountController {

	@ApiOperation(value = "account login", notes = "")
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public RestAPIResult<Boolean> login(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
			@ApiParam(value = "密码") @RequestParam(required = true) String password) {
		return null;
	}
}
