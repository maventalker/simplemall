## 存储方式
	in-momery
	mysql
	es
	cassandra
	每种方式依赖的jar不同
## 跟踪方式
	一种采用原生的sleuth，是http方式。zipkin是其中一种实现方式
	一种采用异步的方式，结合kafaka/rabbitmq等第三方中间件实现，提高效率
	
## Brave
	Brave 是用来装备 Java 程序的类库，提供了面向标准Servlet、Spring MVC、Http Client、JAX RS、Jersey、Resteasy 和 MySQL 等接口的装备能力，可以通过编写简单的配置和代码，让基于这些框架构建的应用可以向 Zipkin 报告数据。同时 Brave 也提供了非常简单且标准化的接口，在以上封装无法满足要求的时候可以方便扩展与定制。

	虽然Brave提供了默认的实现，结合项目实际情况，基本上是需要定制才能满足要求的，本文针对默认实现就不再啰嗦，直接针对定制进行讲解。

	由于项目中用到SpringMvc,HttpClient,Jprotobuf-Rpc-Socket，本文主要介绍针对SpringMvc,HttpClient,Jprotobuf-Rpc-Socket的扩展与定制。

