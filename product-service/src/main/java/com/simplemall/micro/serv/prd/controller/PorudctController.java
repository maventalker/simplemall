package com.simplemall.micro.serv.prd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.prd.service.IPrdService;

@RestController
@RequestMapping("/prd")
public class PorudctController {

	@Autowired
	IPrdService prdService;
	
	@RequestMapping(value = "{tid}")
	public void getPorudctById(String prdId){
		prdService.getProductById(prdId);
	}
}
