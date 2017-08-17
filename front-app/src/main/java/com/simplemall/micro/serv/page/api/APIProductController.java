package com.simplemall.micro.serv.page.api;

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

@Api(value = "商品服务")
@RestController
@RequestMapping("/prd")
public class APIProductController {

	private Logger logger = LoggerFactory.getLogger(APIProductController.class);

	@Autowired
	ProductFeignClient feignClient;

	@ApiOperation(value = "get product detail")
	@RequestMapping(value = "{tid}", method = RequestMethod.POST)
	public RestAPIResult<PrdInfo> getProductById(
			@ApiParam(value = "product id") @RequestParam(required = true) String prdId) {
		logger.info("begin invoke product service");
		RestAPIResult<PrdInfo> restAPIResult = feignClient.getPorudctById(prdId);
		return restAPIResult;
	}

}
