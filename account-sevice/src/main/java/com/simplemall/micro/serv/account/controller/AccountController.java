package com.simplemall.micro.serv.account.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.account.service.IAccountService;

@RestController
@RequestMapping("/acc")
public class AccountController {
	
	private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	IAccountService accountService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(String phone, String password) {
		accountService.login(phone, password);
		logger.info("login ok!");
		return "";
	}

	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String signup(String phone, String password) {
		accountService.signup(phone, password);
		return "";
	}
}
