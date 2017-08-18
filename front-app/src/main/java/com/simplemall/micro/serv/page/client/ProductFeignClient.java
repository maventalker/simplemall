package com.simplemall.micro.serv.page.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.common.bean.product.PrdInfo;

/**
 * get product detail info
 * 
 * @author guooo
 *
 */
@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductFeignClient {

	@RequestMapping("/prd/{prdId}")
	public RestAPIResult<PrdInfo> getPorudctById(String prdId);
}
