package com.simplemall.micro.serv.order.service;

public interface IOrderService {

	boolean createOrder();
	
	String viewOrder(String serialNo,String accountId);
	
	boolean changeOrderState(String serialNo,String state);
}
