package com.simplemall.micro.serv.page.client.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.simplemall.micro.serv.common.bean.product.PrdInfo;
import com.simplemall.micro.serv.page.client.ProductFeignClient;

/**
 * 生成空对象，防止出现Null，对调用方造成其他问题
 * 
 * @author Guooo 2017年9月3日 下午10:02:55
 */
@Component
public class ProductFeignClientHystrix implements ProductFeignClient {

	@Override
	public PrdInfo getPorudctById(String prdId) {
		return new PrdInfo();
	}

	@Override
	public List<PrdInfo> list() {
		return new ArrayList<>();
	}

}
