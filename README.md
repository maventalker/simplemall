# simplemall
a simple mall which architecture based on  micro-service !

	base-serv，提供基础服务，包括路由，链路跟踪，配置中心等等
	
	account-service，用户服务模块，提供用户相关的服务，如注册，登录，地址服务等等
	payament-service，支付服务模块，为商城提供支付服务
	product-service，商品服务类，为前端提供服务支撑
	msg-service，消息处理，采用kafaka异步消费
	order-service，订单模块，提供订单维护功能
	
	front-app，编写页面及服务的调用，h5开发

