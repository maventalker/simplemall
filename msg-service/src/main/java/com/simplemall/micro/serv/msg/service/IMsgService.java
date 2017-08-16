package com.simplemall.micro.serv.msg.service;

public interface IMsgService {

	/**
	 * add a new message
	 * 
	 * @param serialNo
	 * @param msgType
	 * @param target
	 * @param content
	 * @return
	 */
	int addMsg(String serialNo, String msgType, String target, String content);
}
