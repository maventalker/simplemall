package com.simplemall.micro.serv.prd.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemall.micro.serv.common.bean.product.PrdInfo;
import com.simplemall.micro.serv.common.bean.product.PrdInfoCriteria;
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
		logger.info("获取商品详情{}成功!",prdId);
		return info;
	}

	@Override
	public List<PrdInfo> queryPrdList() {
		return prdInfoMapper.selectByExample(new PrdInfoCriteria());
	}

}
