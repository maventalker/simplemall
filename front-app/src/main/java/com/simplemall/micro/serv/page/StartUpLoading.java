package com.simplemall.micro.serv.page;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动后就加载数据
 * 
 * @author guooo
 *
 */
@Component
public class StartUpLoading implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(StartUpLoading.class);

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("--->>>开始加载数据{}", new Date());
	}

}
