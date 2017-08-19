package com.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.simplemall.micro.serv.common.bean.order.OrderDTO;

@RunWith(SpringJUnit4ClassRunner.class)
public class OrderDtoJsonTest {

	@Test
	public void jsonMain() {
		String string = "{baseInfo:{tid:'21312312',serialNo:'vvvvv'},products:[{tid:'111111'},{tid:'22222'}]}";
		JSONObject object = JSONObject.parseObject(string);
		OrderDTO dto = JSONObject.toJavaObject(object, OrderDTO.class);
		Assert.assertTrue("111111".equals(dto.getProducts().get(0).getTid()));

	}

	@Test
	public void test() {
		Assert.assertTrue(1 == 2);
	}
}
