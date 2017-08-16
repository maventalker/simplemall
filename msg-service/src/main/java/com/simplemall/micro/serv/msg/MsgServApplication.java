package com.simplemall.micro.serv.msg;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsgServApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(MsgServApplication.class).web(true).bannerMode(Mode.OFF);
		SpringApplication.run(MsgServApplication.class, args);
		SpringApplication springApplication = new SpringApplication(MsgServApplication.class);
		springApplication.run(args);
	}
}
