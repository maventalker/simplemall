package com.simplemall.micro.serv.order.service.impl;

import org.springframework.stereotype.Service;

import com.simplemall.micro.serv.order.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	@Override
	public boolean create() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String view(String serialNo, String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeOrderState(String serialNo, String state) {
		// TODO Auto-generated method stub
		return false;
	}

}
