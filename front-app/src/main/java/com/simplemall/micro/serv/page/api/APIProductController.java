package com.simplemall.micro.serv.page.api;

import java.util.List;

import org.apache.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.bean.product.PrdInfo;
import com.simplemall.micro.serv.page.client.ProductFeignClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "商品服务", tags = "商品服务")
@RestController
@RequestMapping("/prd")
public class APIProductController {

	private Logger logger = LoggerFactory.getLogger(APIProductController.class);

	@Autowired
	ProductFeignClient feignClient;

	@ApiOperation(value = "获取商品详情")
	@RequestMapping(value = "{tid}", method = RequestMethod.POST)
	public RestAPIResult<PrdInfo> getProductById(
			@ApiParam(value = "product id") @RequestParam(required = true) String prdId) {
		RestAPIResult<PrdInfo> restAPIResult = new RestAPIResult<>();
		logger.info("begin invoke product service");
		PrdInfo info = feignClient.getPorudctById(prdId);
		restAPIResult.setRespData(info);
		return restAPIResult;
	}
	
	@ApiOperation(value = "商品列表展示")
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public RestAPIResult<List<PrdInfo>> list() {
		RestAPIResult<List<PrdInfo>> restAPIResult = new RestAPIResult<>();
		List<PrdInfo> products = feignClient.list();
		restAPIResult.setRespData(products);
		return restAPIResult;
	}
	
	/**
	 * @param prdId
	 * @return
	 */
	@ApiOperation(value = "购买商品，前提是先登陆")
	@RequestMapping(value = "buy/{prdId}", method = RequestMethod.POST)
	public boolean buyProduct(String prdId, HttpRequest request) {
		if (checkAccountOnLine(request)) {
			return false;
		}
		//TODO 登陆后，跳转到结算页面，录入收货地址、支付方式、收货方式等等
		return true;
	}

	/**
	 * 校验用户是否登陆
	 * 
	 * @param request
	 * @return
	 */
	private boolean checkAccountOnLine(HttpRequest request) {
		return false;
	}

}
