package com.simplemall.micro.serv.page.api;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.bean.account.AccAddress;
import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.micro.serv.common.util.UUIDUtils;
import com.simplemall.micro.serv.page.client.AccountFeignClient;
import com.simplemall.micro.serv.page.security.JWTUtils;

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
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。需要重新触发加载动作可以使用POST方式请求/refresh接口，该接口位于spring-boot-starter-actuator依赖，调用前需添加否则404。
public class APIAccountController {

	private Logger logger = LoggerFactory.getLogger(APIAccountController.class);

	/**
	 * 短信开关
	 */
	@Value("${switch.sms}")
	private boolean switchSMS;

	@Autowired
	private AccountFeignClient accountFeignClient;

	@ApiOperation(value = "用户登陆")
	@RequestMapping(value = "acc/login", method = { RequestMethod.POST })
	public RestAPIResult<String> login(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
			@ApiParam(value = "密码") @RequestParam(required = true) String password, HttpSession session) {
		RestAPIResult<String> restAPIResult = new RestAPIResult<>();
		String result = accountFeignClient.login(phone, password);
		if (SystemConstants.Code.FAIL.equals(result)) {
			restAPIResult = new RestAPIResult<>("登陆失败，用户名或密码不正确!");
			restAPIResult.setRespData(result);
		} else {
			try {
				// 正常情况返回jwt
				String accessToken = JWTUtils.createJWT(UUIDUtils.getUUID(), phone, 12 * 60 * 60 * 1000);
				restAPIResult.setRespData(accessToken);
			} catch (Exception e) {
				logger.error("生成jwt异常{}", e);
			}
		}
		logger.info("login result = {}", restAPIResult.getRespData());
		return restAPIResult;
	}

	/**
	 * @param phone
	 * @param password
	 * @return
	 */
	@ApiOperation(value = "用户注册")
	@RequestMapping(value = "acc/signup", method = { RequestMethod.POST })
	public RestAPIResult<String> signup(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
			@ApiParam(value = "密码") @RequestParam(required = true) String password) {
		RestAPIResult<String> restAPIResult = new RestAPIResult<>();
		String rtn = accountFeignClient.signup(phone, password);
		if (SystemConstants.Code.FAIL.equals(rtn)) {
			restAPIResult = new RestAPIResult<>("注册失败，用户名已存在!");
		} else {
			if (switchSMS) {
				logger.info("开始发送注册成功短信！");
			}
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
	public RestAPIResult<List<AccAddress>> queryAccAddress(@PathVariable("accountTid") String accountTid,String accessToken) {
		RestAPIResult<List<AccAddress>> apiResult = new RestAPIResult<>();
		List<AccAddress> liString = accountFeignClient.getList(accountTid);
		apiResult.setRespData(liString);
		return apiResult;
	}
}
