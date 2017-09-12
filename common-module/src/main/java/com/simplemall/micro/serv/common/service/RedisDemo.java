package com.simplemall.micro.serv.common.service;

public class RedisDemo {

	public static void  main(String args[]){
		//以key为键，value为值，插入redis数据库，并取出key的值（默认为0号数据库）
		JedisUtil.STRINGS.set("key", "value");
		System.out.println(JedisUtil.STRINGS.get("key"));
		
		///以key为键，value为值，插入redis的15号数据库，并从15号数据库取出值
		JedisUtil.STRINGS.set("key", "value", 15);
		JedisUtil.STRINGS.get("key", 15);
		
		//判断redis数据库中是否存在名字为“key”的键，默认从0号数据库中查找，也可以指定数据库编号
		JedisUtil.KEYS.exists("key");
		JedisUtil.KEYS.exists("key", 15);
		
		//设置“key”键的超时时间，默认设置0号数据库中的键，也可以指定数据库
		JedisUtil.KEYS.expired("key", 500);
		JedisUtil.KEYS.expired("key", 500, 15);
	}
	
}
