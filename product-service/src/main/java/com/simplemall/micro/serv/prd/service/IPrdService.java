package com.simplemall.micro.serv.prd.service;

import com.simplemall.micro.serv.common.bean.product.PrdInfo;

public interface IPrdService {

	/**
	 * 商品详情
	 * 
	 * @param prdId
	 * @return
	 */
	PrdInfo getProductById(String prdId);
}
