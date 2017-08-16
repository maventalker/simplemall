package com.simplemall.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.account.service.IAccountService;
import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.constant.SystemConstants;

/**
 * 个人账户
 * 
 * @author guooo
 *
 */
@RestController
@RequestMapping("/acc")
public class AccountController {

	@Autowired
	IAccountService accountService;

	/**
	 * 登陆
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public RestAPIResult<String> login(@RequestParam("phone") String phone, @RequestParam("password") String password) {
		RestAPIResult<String> restAPIResult = new RestAPIResult<>();
		boolean result = accountService.login(phone, password);
		restAPIResult.setRespData(result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL);
		return restAPIResult;
	}

	/**
	 * 注册
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public RestAPIResult<String> signup(String phone, String password) {
		RestAPIResult<String> restAPIResult = new RestAPIResult<>();
		boolean result = accountService.signup(phone, password);
		restAPIResult.setRespData(result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL);
		return restAPIResult;
	}
}
