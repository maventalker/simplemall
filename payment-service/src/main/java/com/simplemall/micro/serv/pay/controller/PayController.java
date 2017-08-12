package com.simplemall.micro.serv.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.pay.service.IPayService;

@RestController
@RequestMapping("/payController")
public class PayController {

	@Autowired
	IPayService payService;
	
	/**
	 * @param serialNo
	 * @param payType
	 * @return
	 */
	public String pay(@RequestParam("serialNo") String serialNo,@RequestParam("payType") String payType ){
		return null;
	}
}
