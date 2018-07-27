package com.simplemall.micro.serv.base.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableAdminServer
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
public class AdminServerApplicaton {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerApplicaton.class, args);
	}

}
