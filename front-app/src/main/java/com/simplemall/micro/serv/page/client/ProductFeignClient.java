package com.simplemall.micro.serv.page.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplemall.micro.serv.common.bean.product.PrdInfo;

/**
 * get product detail info
 * 
 * @author guooo
 *
 */
@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductFeignClient {

	@RequestMapping(value = "/prd/{prdId}",method = RequestMethod.POST)
	public PrdInfo getPorudctById(@RequestParam(value = "prdId",required= true) String prdId);
	
	@RequestMapping(value = "/prd/list",method = RequestMethod.POST)
	public List<PrdInfo> list();
}
