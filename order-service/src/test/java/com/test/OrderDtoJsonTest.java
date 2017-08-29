package com.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.simplemall.micro.serv.common.bean.order.OrderDTO;
import com.simplemall.micro.serv.common.bean.order.OrderInfo;
import com.simplemall.micro.serv.common.bean.order.OrderProduct;
import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.micro.serv.common.util.SnowflakeIdWorker;


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
		OrderDTO orderDTO = new OrderDTO();
		//base info 
		OrderInfo info = new OrderInfo();
		info.setSerialNo(String.valueOf(SnowflakeIdWorker.generateSerialNos()));
		info.setPayStatus(SystemConstants.PAY_STATUS.UNPAY);
		info.setPayType(SystemConstants.PAY_TYPE.ALIPAY);
		info.setPostFee(BigDecimal.valueOf(23.45));
		info.setPostWay(SystemConstants.SHIP_WAY.FEDEX);
		info.setPrice(BigDecimal.valueOf(3400));
		info.setShippingAccount("Guooo");
		info.setShippingAddress("Tianxin District,ChangSha,China");
		info.setShippingPhone("176737388866");
		orderDTO.setBaseInfo(info);
		
		//product info
		OrderProduct product = new OrderProduct();
		product.setPrdName("一加手机5 (A5000) 8GB+128GB 星辰黑 全网通 双卡双待 移动联通电信4G手机");
		product.setPrdPrice(BigDecimal.valueOf(3400));
//		product.setSerialNo("");在添加工程中，自动添加进去
		product.setPrdQty(1);
		List<OrderProduct> products = new ArrayList<>();
		products.add(product);
		orderDTO.setProducts(products);
		
		String jsonObject = JSONObject.toJSONString(orderDTO);
		System.out.println(jsonObject);
		
		Assert.assertTrue(true);
		
	}
}
