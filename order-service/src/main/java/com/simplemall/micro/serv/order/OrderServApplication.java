package com.simplemall.micro.serv.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderServApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServApplication.class, args);
	}
}
