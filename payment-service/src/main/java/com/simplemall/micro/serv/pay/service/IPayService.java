package com.simplemall.micro.serv.pay.service;

import java.math.BigDecimal;

public interface IPayService {

	/**
	 * @param serialNo
	 * @param payType
	 * @param price
	 * @return
	 */
	int pay(String serialNo,String payType,BigDecimal price);
}
