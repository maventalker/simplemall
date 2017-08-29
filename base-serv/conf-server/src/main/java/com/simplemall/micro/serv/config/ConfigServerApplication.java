package com.simplemall.micro.serv.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * spring config server
 * 
 * @author guooo
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {
	
	// FIXME encrypt配置文件
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
