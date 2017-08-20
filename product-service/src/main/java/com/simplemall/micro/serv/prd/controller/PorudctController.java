package com.simplemall.micro.serv.prd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.product.PrdInfo;
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
	@RequestMapping(value = "{prdId}", method = RequestMethod.POST)
	public PrdInfo getPorudctById(String prdId) {
		return prdService.getProductById(prdId);
	}

	/**
	 * 获取商品列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public List<PrdInfo> list() {
		return prdService.queryPrdList();
	}

}
