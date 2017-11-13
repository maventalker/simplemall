package com.simplemall.micro.serv.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * API Gateway
 * TODO 与zuul实现同样的功能还有kong，官网地址：https://getkong.org
 * 
 * @author guooo
 *
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

}
