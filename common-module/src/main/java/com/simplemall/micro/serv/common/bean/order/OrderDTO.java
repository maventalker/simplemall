package com.simplemall.micro.serv.common.bean.order;

import java.util.List;

import lombok.Data;

@Data
public class OrderDTO {

	OrderInfo baseInfo;
	
	List<OrderProduct> products;
	
	List<OrderState> stateChanges;
}
