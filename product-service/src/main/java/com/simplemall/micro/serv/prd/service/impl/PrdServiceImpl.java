package com.simplemall.micro.serv.prd.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemall.micro.serv.prd.bean.PrdInfo;
import com.simplemall.micro.serv.prd.mapper.PrdInfoMapper;
import com.simplemall.micro.serv.prd.service.IPrdService;

@Service
public class PrdServiceImpl implements IPrdService {
	private Logger logger = LoggerFactory.getLogger(PrdServiceImpl.class);
	

	@Autowired
	PrdInfoMapper prdInfoMapper;

	@Override
	public PrdInfo getProductById(String prdId) {
		PrdInfo info = prdInfoMapper.selectByPrimaryKey(prdId);
		logger.info("获取商品详情{}",info.getLabelName());
		return info;
	}

}
