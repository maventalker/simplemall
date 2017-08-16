package com.simplemall.micro.serv.order.service;

public interface IOrderService {

	boolean create();
	
	String view(String serialNo,String accountId);
	
	boolean changeOrderState(String serialNo,String state);
}
