# QuickStart
A simple mall which architecture based on  micro-service !

	base-serv，提供基础服务，包括路由，链路跟踪，配置中心等等
	
	account-service，用户服务模块，提供用户相关的服务，如注册，登录，地址服务等等
	payament-service，支付服务模块，为商城提供支付服务
	product-service，商品服务类，为前端提供服务支撑
	msg-service，消息处理，采用kafaka异步消费
	order-service，订单模块，提供订单维护功能
	
	front-app，编写页面及服务的调用，h5开发
	
Each application module port
	
	sleuth server:9001
	admin server :9002
	eureka server:9003
	cofig server :9004
	account-service:8080
	product-service:8081
	payment-service:8082
	order-service  :8083
	msg-service    :8084
	front-app      :8088
#Release Version
##v1.0 
	Release Date : 2017-08-17
	1、完成基本服务及业务子模块服务的搭建 ，业务子模块可正常运行
	2、完成SpringBootAdmin业务模块的运行监控，及Eureka服务运行，满足各业务基础服务的注册、发现功能
	3、可通过Front-app端，借助Feign组件发起login/signup等功能的 简单测试运行。
	下一版本，将基于此版本之上，继续完善完整的购物实现，包括简单的页面、api管理/调用等等。