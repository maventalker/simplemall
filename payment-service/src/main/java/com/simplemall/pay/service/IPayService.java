package com.simplemall.pay.service;

public interface IPayService {

	/**
	 * @param serialNo
	 * @param payType
	 * @param price
	 * @return
	 */
	int pay(String serialNo,String payType,String status);
}
