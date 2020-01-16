## Stargazers over time

[![Stargazers over time](https://starcharts.herokuapp.com/backkoms/simplemall.svg)](https://starcharts.herokuapp.com/backkoms/simplemall)
      
# QuickStart
基于SpringCloud体系实现，简单购物流程实现，满足基本功能：注册、登录、商品列表展示、商品详情展示、订单创建、详情查看、订单支付、库存更新等等。

每个业务服务采用独立的MYSQL数据库，初期考虑用到如下组件：
1. 服务注册、发现: eureka
2. 配置管理:spring config , spring security
3. 集群容错: hystrix
4. API网关: zuul
5. 服务负载:feign+ribbon
6. api文档输出:swagger2
7. 代码简化:lombok
8. 消息队列:rabbitmq
9. 分布式锁: redis （待实现）
10. 链路跟踪:spring cloud sletuh ->zipkin
11. 安全认证:oauth2/JWT(通过JWT轻量级的实现)
12. 服务监控:spring-boot-admin


# 各模块介绍

| 模块名称        | 端口   |  简介  |
| --------   | -----:  | :----:  |
| admin-server      | 9002   |   服务监控中心，监控所有服务模块    |
| conf-server        |   9004   |   分布式配置中心，结合spring-security/rabbitmq同时使用   |
| eureka-server        |    9003    |  服务注册中心，提供服务注册、发现功能  |
| sleuth-server        |    9001    |  SpringCloud实现的一种分布式追踪解决方案，兼容Zipkin  |
| zuul-server        |    9005    |  API网关模块  |
| account-service        |    8080    |  用户服务，提供注册、登录、地址等服务  |
| product-service       |    8081    |  商品服务，提供商品列表、详情、库存更新等服务  |
| payment-service    |    8082    |  支付服务，支付记录  |
| order-service        |    8083    |  订单服务，提供订单创建、详情、状态变更  |
| msg-service        |    8084    |  消息处理服务  |
| front-app        |    8088    |  前端服务，结合swagger2提供API管理(有小问题，swagger页面无法点击单个接口，可通过展开功能打开，待解决)  |


# 快速上手
- 0、基础软件依赖，rabbitmq\redis
- 1、先启动admin-server,eureka-server,conf-server三个基础服务
- 2、再依次启动payment/order/product/account基础业务服务
- 3、最后启动front-app服务，打开浏览器，输入http://localhost:8088/swagger-ui.html ，根据流程API依次可使用功能[swagger主界面存在bug，不能选择某个api展开收缩，可通过全部展开/收缩的形式使用]
- 4、后续有时间再提供页面，基于VUE2+BOOTSTRAP，将流程串起来

# 相关测试
	1、启动基础eureka/config两个服务后，直接启动front-app服务，通过swagger测试商品列表或详情功能来测试hystrix的功能
	1.1、启动hystrix-dashboard服务，输入监控地址http://localhost:8088/hystrix.stream可以查看监控视图
	2、输入http://localhost:9005/account-service/acc/login?phone=123123&password=123123查看返回结果

# 关注公众号，获取更多内容
![image](https://github.com/backkoms/backkoms.github.io/blob/master/qrcode_for_gh_28fb95c9c24c_258.jpg?raw=true)

个人主页：[https://backkoms.github.io](https://backkoms.github.io)

微信号：Dqango

# 基于SpringBoot+Dubbo微服务开发实战基础框架

github：[https://github.com/backkoms/web-service-demo](https://github.com/backkoms/web-service-demo)

github：[https://github.com/backkoms/web-api-demo](https://github.com/backkoms/web-api-demo)

打赏码
![image](WechatIMG304.jpeg)


### 我的知识星球，内容：个人心得体会分享（阅读、写作、职业规划、职业困惑、个人成长、技术提升）、问题提问
![](https://imgkr.cn-bj.ufileos.com/75ab2d42-80b1-4164-9ac5-c23de5f522e6.png)

### 个人微信，欢迎骚扰
![](https://imgkr.cn-bj.ufileos.com/e37c25c2-d2a4-4174-953b-07adbd0f9b56.jpeg)

### 微服务专栏（SpringCloud、SpringCloudAlibaba、Apache Dubbo）
[专栏地址：https://xiaozhuanlan.com/msa-practice](https://xiaozhuanlan.com/msa-practice)
![](https://imgkr.cn-bj.ufileos.com/227bc922-220f-4f68-b114-132bcbd53436.jpg)
