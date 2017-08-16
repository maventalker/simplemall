package com.simplemall.account.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemall.account.bean.AccAddress;
import com.simplemall.account.bean.AccAddressCriteria;
import com.simplemall.account.bean.Account;
import com.simplemall.account.bean.AccountCriteria;
import com.simplemall.account.dal.AccAddressMapper;
import com.simplemall.account.dal.AccountMapper;
import com.simplemall.account.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	AccountMapper accountMapper;

	@Autowired
	AccAddressMapper addressMapper;

	@Override
	public AccAddress getAccAddress(String tid) {
		return null;
	}

	@Override
	public boolean login(String phone, String password) {
		AccountCriteria criteria = new AccountCriteria();
		criteria.createCriteria().andPhoneEqualTo(phone).andPasswordEqualTo(password);
		List<Account> list = accountMapper.selectByExample(criteria);
		return CollectionUtils.isNotEmpty(list);
	}

	@Override
	public boolean signup(String phone, String password) {
		Account account = new Account();
		account.setPhone(phone);
		account.setPassword(password);
		int result = accountMapper.insertSelective(account);
		return result > 0 ? true : false;
	}

	@Override
	public List<AccAddress> getAddressList(String accountId) {
		AccAddressCriteria criteria = new AccAddressCriteria();
		criteria.createCriteria().andAccountIdEqualTo(accountId);
		List<AccAddress> list = addressMapper.selectByExample(criteria);
		return list;
	}

}
