package com.simplemall.micro.serv.page.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.bean.account.AccAddress;
import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.micro.serv.page.client.AccountFeignClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 采用feign客户端调用服务
 * 
 * @author guooo
 *
 */
@Api(value = "用户服务", tags = "用户服务接口")
@RestController
@RequestMapping("/acc")
public class APIAccountController {

	private Logger logger = LoggerFactory.getLogger(APIAccountController.class);

	@Autowired
	private AccountFeignClient accountFeignClient;

	@Autowired
	private RestTemplate restTemplate;

	@ApiOperation(value = "用户注册")
	@RequestMapping(value = "login", method = { RequestMethod.POST })
	public RestAPIResult<String> login(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
			@ApiParam(value = "密码") @RequestParam(required = true) String password) {
		RestAPIResult<String> restAPIResult = new RestAPIResult<>();
		String result = accountFeignClient.login(phone, password);
		if (SystemConstants.Code.FAIL.equals(result)) {
			restAPIResult = new RestAPIResult<>("登陆失败，用户名或密码不正确!");
		}
		restAPIResult.setRespData(result);
		logger.info("login result = {}", restAPIResult.getRespData());
		return restAPIResult;
	}

	/**
	 * @param phone
	 * @param password
	 * @return
	 */
	@ApiOperation(value = "用户登陆")
	@RequestMapping(value = "signup", method = { RequestMethod.POST })
	public RestAPIResult<String> signup(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
			@ApiParam(value = "密码") @RequestParam(required = true) String password) {
		RestAPIResult<String> restAPIResult = new RestAPIResult<>();
		String rtn = accountFeignClient.signup(phone, password);
		if (SystemConstants.Code.FAIL.equals(rtn)) {
			restAPIResult = new RestAPIResult<>("注册失败，用户名已存在!");
		}
		restAPIResult.setRespData(rtn);
		logger.info("login result = {}", restAPIResult.getRespData());
		return restAPIResult;
	}

	/**
	 * query account's address list
	 * 
	 * @param accountTid
	 * @return
	 */
	@ApiOperation(value = "获取用户地址列表")
	@RequestMapping(value = "address/list/{accountTid}", method = RequestMethod.POST)
	public RestAPIResult<List<AccAddress>> queryAccAddress(String accountTid) {
		RestAPIResult<List<AccAddress>> apiResult = new RestAPIResult<>();
		List<AccAddress> liString = accountFeignClient.getList(accountTid);
		apiResult.setRespData(liString);
		return apiResult;
	}
}
