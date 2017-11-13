package com.simplemall.micro.serv.page.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplemall.micro.serv.common.bean.account.AccAddress;
import com.simplemall.micro.serv.common.bean.account.Account;

/**
 * feign与@RequestParam配合使用时，一定要写value值。
 * feign方法的@RequestMapping，务必与服务端方法保持一致，请求类型，请求参数，返回值等等
 * 
 * TODO 可以从服务端定义一个接口层，服务实现层实现接口，调用方扩展此接口，即可完成接口定义的复用，而无须在此重新复制一次。
 * 但此举会导致服务端接口变动后，调用方就会直接受影响，建议事先约定好规则
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
	public Account login(@RequestParam("phone") String phone, @RequestParam("password") String password);

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
	public List<AccAddress> getList(
			@RequestParam(value = "accountTid", required = true) @PathVariable("accountTid") String accountTid);
}
