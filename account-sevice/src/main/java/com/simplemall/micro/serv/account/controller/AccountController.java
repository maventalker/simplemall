package com.simplemall.micro.serv.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.account.service.IAccountService;

@RestController
@RequestMapping("/acc")
public class AccountController {

	@Autowired
	IAccountService accountService;
	
	@RequestMapping(value = "login")
	public String login(String name,String password){
		return "";
	}
	
	public String signup(String name,String password){
		return "";
	}
}
