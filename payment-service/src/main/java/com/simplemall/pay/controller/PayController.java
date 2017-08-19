package com.simplemall.pay.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.pay.service.IPayService;

@RestController
@RequestMapping("/payment")
public class PayController {

	@Autowired
	IPayService payService;

	/**
	 * pay
	 * 
	 * @param serialNo
	 * @param payType
	 * @return
	 */
	@RequestMapping(value = "/pay", method = RequestMethod.POST)
	public Integer pay(@RequestParam("serialNo") String serialNo, @RequestParam("payType") String payType,
			@RequestParam("price") BigDecimal price) {
		int result = payService.pay(serialNo, payType, price);
		return result;
	}
}
