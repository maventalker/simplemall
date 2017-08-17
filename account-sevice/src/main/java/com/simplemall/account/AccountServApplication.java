package com.simplemall.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 * 
 * @author guooo
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AccountServApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServApplication.class, args);
	}

}
