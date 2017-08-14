package com.simplemall.micro.serv.prd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServApplication.class, args);
	}

}
