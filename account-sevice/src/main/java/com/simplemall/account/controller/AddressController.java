package com.simplemall.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.account.bean.AccAddress;
import com.simplemall.account.service.IAccountService;
import com.simplemall.micro.serv.common.bean.RestAPIResult;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	IAccountService accountService;

	@RequestMapping("list/{accountId}")
	public RestAPIResult<List<AccAddress>> getList(@RequestParam(required = true) String accountTid) {
		RestAPIResult<List<AccAddress>> apiResult = new RestAPIResult<>();
		List<AccAddress> list = accountService.getAddressList(accountTid);
		apiResult.setRespData(list);
		return apiResult;
	}
}
