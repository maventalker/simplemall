package com.simplemall.micro.serv.msg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsgServApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgServApplication.class, args);
	}
}
