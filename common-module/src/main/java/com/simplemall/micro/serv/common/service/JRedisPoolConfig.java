package com.simplemall.micro.serv.common.service;

public class JRedisPoolConfig {
	
	public static String REDIS_IP = "127.0.0.1";

	public static int REDIS_PORT = 6379;

	// 可用连接实例的最大数目，默认值为8；
	// 如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
	public static int MAX_ACTIVE = 1024;

	// 控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值也是8。
	public static int MAX_IDLE = 200;

	// 等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException；
	public static int MAX_WAIT = 10000;

	public static int TIMEOUT = 10000;

	public static int RETRY_NUM = 5;

	public static boolean TEST_ON_BORROW = true;

	public static boolean TEST_ON_RETURN = true;

}
