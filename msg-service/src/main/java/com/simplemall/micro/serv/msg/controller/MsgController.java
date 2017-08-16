package com.simplemall.micro.serv.msg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.RestAPIResult;
import com.simplemall.micro.serv.msg.service.IMsgService;

@RestController
@RequestMapping("/msg")
public class MsgController {

	@Autowired
	IMsgService msgService;

	/**
	 * 添加一条消息
	 * 
	 * @param serialNo
	 * @param msgType
	 * @param target
	 * @param content
	 * @return
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public RestAPIResult<Integer> addMsg(String serialNo, String msgType, String target, String content) {
		RestAPIResult<Integer> apiResult = new RestAPIResult<Integer>();
		int result = msgService.addMsg(serialNo, msgType, target, content);
		apiResult.setRespData(result);
		return apiResult;
	}
}
