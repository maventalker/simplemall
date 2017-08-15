package com.simplemall.micro.serv.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * 
 * @author guooo
 *
 */
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"controller","service","dal","config"})
@EnableDiscoveryClient
public class AccountServApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServApplication.class, args);
	}

}
