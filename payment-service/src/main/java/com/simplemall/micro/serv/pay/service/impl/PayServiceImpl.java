package com.simplemall.micro.serv.pay.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.simplemall.micro.serv.pay.service.IPayService;

@Service
public class PayServiceImpl implements IPayService {

	@Override
	public int pay(String serialNo, String payType, BigDecimal price) {
		// TODO Auto-generated method stub
		return 0;
	}

}
