#ReadMe
	1、config-client项目的pom中加入spring-boot-starter-actuator，依赖其监控机制，来刷新config-server中配置的变化，config-client客户端中增加@RefreshScope，来手动修正配置荐的变化。但不能有效的将config-server中变化的信息实时的更新到客户端，是个弊端。
	
	2、引入bus来修复上一阶段产生的不能实时更新消息的bug
	
	
	http://www.cnblogs.com/unqiang/p/5166770.html kafaka setup documents
##其它组件
百度的Disconf，360的QConf，taobao的Diamond，自己能过zookeeper实现的配置中心