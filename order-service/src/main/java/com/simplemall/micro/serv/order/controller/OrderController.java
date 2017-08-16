package com.simplemall.micro.serv.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.order.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	IOrderService orderService;
	
	@RequestMapping(value = "create")
	public void createOrder(){
	}
	
	@RequestMapping(value = "view")
	public void viewOrder(String serialNo,String accountId){
	}
	
	@RequestMapping(value = "state/change")
	public void changeOrderState(String serialNo,String state){
		orderService.changeOrderState(serialNo, state);
	}
}
