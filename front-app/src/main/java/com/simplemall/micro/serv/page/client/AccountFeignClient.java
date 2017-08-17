package com.simplemall.micro.serv.page.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplemall.micro.serv.common.bean.RestAPIResult;

@FeignClient(name = "ACCOUNT-SERVICE")
public interface AccountFeignClient {

	/**
	 * 登录
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping("/acc/login")
	public RestAPIResult<String> login(@RequestParam("phone") String phone, @RequestParam("password") String password);

	/**
	 * 注册
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping("/acc/signup")
	public RestAPIResult<String> signup(@RequestParam("phone") String phone, @RequestParam("password") String password);

}
