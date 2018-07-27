package com.simplemall.micro.serv.base.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 集群监控，必须引入acutor组件。 
 * 
 * TODO 可以依赖turbine-amqp，由rabbitmq作数据中转
 * 
 * @author Guooo 2017年10月3日 上午10:22:53
 */
@SpringBootApplication
@EnableTurbine
@EnableDiscoveryClient
public class TurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineApplication.class, args);
	}

}
