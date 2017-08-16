package com.simplemall.account.web;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());
    
    
	//单位时间内的调用次数
	private int flag = 10;
    //单位时间1000ms * 60 = 1min
    private static int timeRound = 1000*60;
    //用来标记调用次数
    private static AtomicLong num = new AtomicLong(0);

    @Autowired
    private DiscoveryClient client;
    
//    static{
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask(){
//          @Override
//          public void run() {
//        	  num.set(0);;
//          }
//        }, 0, timeRound);
//    }

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
    	
//        num.incrementAndGet();
//        
//        if (num.get() <= flag) {
//	        ServiceInstance instance = client.getLocalServiceInstance();
//	        Integer r = a + b;
//	        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
//	        return "From Service-B, Result is " + r+"\nPort:"+instance.getPort();
//        }
//        return "调用次数超限，一分钟内最多只能调用10次！";
    	/*InterfaceLimit limit = service.getEntityByPri(1);
    	Jedis jedis = RedisUtils.getJedis();
    	
    	//redis存的超时时间
    	String timeRound_1 = jedis.get("timeRound_1");
    	//如果不存在或者是不等于数据库设置值
    	if (timeRound_1 == null || !limit.getUnitTime().toString().equals(timeRound_1)) {
    		//重新设置超时时间
			jedis.set("timeRound_1", limit.getUnitTime().toString());
			jedis.expire("num_1", limit.getUnitTime());
		}
    	String num_1 = jedis.get("num_1");
    	if (num_1 == null) {
    		jedis.set("num_1", String.valueOf(0));
			jedis.expire("num_1", limit.getUnitTime());
		}
    	
    	jedis.incr("num_1");
        
        if (Integer.parseInt(jedis.get("num_1")) <= limit.getUnitNum()) {
	        ServiceInstance instance = client.getLocalServiceInstance();
	        Integer r = a + b;
	        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
	        return "From Service-B, Result is " + r+"\nPort:"+instance.getPort();
        }*/
        
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return "From Service-B, Result is " + r+"\nPort:"+instance.getPort();
//        return "调用次数超限！";
    }
    
  //B服务调用A服务
    @RequestMapping(value="testServiceA",method=RequestMethod.GET)
    public String testServiceB(@RequestParam Integer a,@RequestParam Integer b){
    	RestTemplate restTemplate=new RestTemplate();
    	return restTemplate.getForObject("http://localhost:7074/add?a="+a+"&b="+b, String.class);
    }

}