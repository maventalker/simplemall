package com.simplemall.micro.serv.order.bean;

import java.util.List;

import lombok.Data;

@Data
public class OrderDTO {

	OrderInfo baseInfo;
	
	List<OrderProduct> products;
	
	List<OrderState> stateChanges;
}
