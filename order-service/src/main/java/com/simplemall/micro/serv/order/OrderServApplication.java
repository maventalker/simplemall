package com.simplemall.micro.serv.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement
public class OrderServApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServApplication.class, args);
	}
}
