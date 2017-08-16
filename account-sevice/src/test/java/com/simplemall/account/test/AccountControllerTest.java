package com.simplemall.account.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.simplemall.account.AccountServApplication;
import com.simplemall.account.bean.Account;
import com.simplemall.account.dal.AccountMapper;
import com.simplemall.account.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = AccountServApplication.class)
public class AccountControllerTest {

	@Autowired
	private IAccountService accountService;

	@Autowired
	AccountMapper accountMapper;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String phone = "14534343434";
		String password = "23123123";
		Account account = new Account();
		account.setPhone(phone);
		account.setPassword(password);
		int apiResult = accountMapper.insertSelective(account);
		Assert.assertTrue(apiResult>0);
	}
}
