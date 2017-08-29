package com.simplemall.micro.serv.page.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplemall.micro.serv.common.bean.account.AccAddress;

/**
 * feign与@RequestParam配合使用时，一定要写value值。
 * feign方法的@RequestMapping，务必与服务端方法保持一致，请求类型，请求参数，返回值等等
 * 
 * @author guooo
 *
 */
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
	public String login(@RequestParam("phone") String phone, @RequestParam("password") String password);

	/**
	 * 注册
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping("/acc/signup")
	public String signup(@RequestParam("phone") String phone, @RequestParam("password") String password);

	/**
	 * get address list
	 * 
	 * @param accountTid
	 * @return
	 */
	@RequestMapping("/address/list/{accountTid}")
	public List<AccAddress> getList(@RequestParam(value = "accountTid", required = true) @PathVariable("accountTid") String accountTid);
}
