package com.simplemall.micro.serv.base.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthServerApplicaton {

	public static void main(String[] args) {
		SpringApplication.run(SleuthServerApplicaton.class, args);
	}

}
