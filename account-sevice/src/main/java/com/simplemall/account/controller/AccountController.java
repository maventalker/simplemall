package com.simplemall.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.account.service.IAccountService;
import com.simplemall.micro.serv.common.bean.account.Account;
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
	@RequestMapping(value = "login", method = {RequestMethod.GET,RequestMethod.POST})
	public Account login(@RequestParam("phone") String phone, @RequestParam("password") String password) {
		Account result = accountService.login(phone, password);
		return result;
	}

	/**
	 * 注册
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String signup(String phone, String password) {
		boolean result = accountService.signup(phone, password);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
}
