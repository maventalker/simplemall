package com.simplemall.pay.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.simplemall.pay.service.IPayService;

@Service
public class PayServiceImpl implements IPayService {

	@Override
	public int pay(String serialNo, String payType, BigDecimal price) {
		// TODO Auto-generated method stub
		return 0;
	}

}
