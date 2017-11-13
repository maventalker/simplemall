package com.simplemall.micro.serv.base.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * 两种方式实现链式跟踪，一种使用http的方式接受消息，一种采用消息中间件的形式来跟踪信息
 * 下方注释掉的注解为http方式，与Pom.xml配置中io.zipkin.java/zipkin-server配套使用
 * 目前代码采用的是mq异步消息方式跟踪信息
 * 
 * 
 * 提供多种信息跟踪信息的存储方式，本示例采用的是in-memory方式，服务关掉之后数据即消失，仅用于测试
 * mysql方式存储，脚本地址：https://github.com/openzipkin/zipkin/blob/master/zipkin-storage/mysql/src/main/resources/mysql.sql 与zipkin-autoconfigure-storage-mysql配合使用
 * es方式存储，与zipkin-autoconfigure-storage-elasticsearch-http配合使用
 * 
 * 
 * @author Guooo 2017年10月5日 上午6:55:59 Cannot determine embedded database driver
 *         class for database type NONE
 */
//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
// @EnableZipkinServer //使用Stream方式启动ZipkinServer
@EnableZipkinStreamServer
@EnableDiscoveryClient
public class SleuthServerApplicaton {

	public static void main(String[] args) {
		SpringApplication.run(SleuthServerApplicaton.class, args);
	}

}
