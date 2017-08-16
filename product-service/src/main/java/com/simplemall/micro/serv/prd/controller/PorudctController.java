package com.simplemall.micro.serv.prd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.prd.bean.PrdInfo;
import com.simplemall.micro.serv.prd.service.IPrdService;

@RestController
@RequestMapping("/prd")
public class PorudctController {

	@Autowired
	IPrdService prdService;

	/**
	 * get a product info
	 * 
	 * @param prdId
	 * @return
	 */
	@RequestMapping(value = "{tid}", method = RequestMethod.POST)
	public RestAPIResult<PrdInfo> getPorudctById(String prdId) {
		RestAPIResult<PrdInfo> apiResult = new RestAPIResult<>();
		PrdInfo info = prdService.getProductById(prdId);
		apiResult.setRespData(info);
		return apiResult;
	}
}
