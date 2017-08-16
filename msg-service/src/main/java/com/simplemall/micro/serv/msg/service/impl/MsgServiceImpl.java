package com.simplemall.micro.serv.msg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemall.micro.serv.msg.bean.MsgNotice;
import com.simplemall.micro.serv.msg.mapper.MsgNoticeMapper;
import com.simplemall.micro.serv.msg.service.IMsgService;

@Service
public class MsgServiceImpl implements IMsgService {

	@Autowired
	MsgNoticeMapper msgNoticeMapper;

	@Override
	public int addMsg(String serialNo, String msgType, String target, String content) {
		MsgNotice notice = new MsgNotice();
		notice.setSerialNo(serialNo);
		notice.setTargetAddress(target);
		notice.setTargetType(msgType);
		notice.setContent(content);
		int rtn = msgNoticeMapper.insertSelective(notice);
		return rtn;
	}

}
