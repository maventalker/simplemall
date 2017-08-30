package com.simplemall.account.test;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.simplemall.account.AccountServApplication;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = AccountServApplication.class)
public class Jasyptest {
	
	@Autowired
	StringEncryptor encryptor;
	
	@Test
	public void getPass() {
		String result = encryptor.encrypt("root");
        System.out.println(result+"----------------"); 
        Assert.assertTrue(result.length() > 0);
	}
}
