package com.simplemall.micro.serv.page.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ORDER-SERVICE")
public interface OrderFeignClient {

	/**
	 * 创建订单
	 * 
	 * @param orderJsonStr
	 * @return
	 */
	@RequestMapping(value = "/order/create", method = RequestMethod.POST)
	public String createOrder(@RequestParam(value = "orderJsonStr", required = true) String orderJsonStr);
}
