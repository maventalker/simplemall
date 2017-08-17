package com.simplemall.micro.serv.page.web;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplemall.micro.serv.common.bean.RestAPIResult;

import io.swagger.annotations.ApiParam;

/**
 * 传统方式调用服务
 * 
 * @author guooo
 *
 */
@RestController
@RequestMapping("/account")
public class AccountController {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "login", method = { RequestMethod.POST, RequestMethod.GET })
	public RestAPIResult<String> login(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
			@ApiParam(value = "密码") @RequestParam(required = true) String password) {
		RestAPIResult<String> restAPIResult = new RestAPIResult<>();
		String result = this.restTemplate
				.getForObject("http://guooo-PC:8080/acc/login?phone=" + phone + "&password=" + password, String.class);
		logger.info("login result = {}", result);
		return restAPIResult;
	}
}
