package com.simplemall.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.account.service.IAccountService;
import com.simplemall.micro.serv.common.bean.account.AccAddress;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	IAccountService accountService;

	@RequestMapping("list/{accountTid}")
	public List<AccAddress> getList(@RequestParam(required = true) @PathVariable("accountTid") String accountTid,String jwtToken) {
		List<AccAddress> list = accountService.getAddressList(accountTid);
		return list;
	}
}
