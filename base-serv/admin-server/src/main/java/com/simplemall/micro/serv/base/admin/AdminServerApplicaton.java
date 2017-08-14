package com.simplemall.micro.serv.base.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * 入口方法
 * 
 * @author guooo
 *
 */
@SpringBootApplication
@EnableAdminServer
public class AdminServerApplicaton {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerApplicaton.class, args);
	}

}
