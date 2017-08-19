package com.simplemall.pay.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemall.pay.bean.PayRecord;
import com.simplemall.pay.dal.PayRecordMapper;
import com.simplemall.pay.service.IPayService;

@Service
public class PayServiceImpl implements IPayService {

	@Autowired
	PayRecordMapper recordMapper;
	
	@Override
	public int pay(String serialNo, String payType,BigDecimal price) {
		PayRecord record = new PayRecord();
		record.setSerialNo(serialNo);
		record.setType(payType);
		//Fixme 订单金额需要知会支付方
		return recordMapper.insertSelective(record);
	}

}
