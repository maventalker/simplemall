package com.simplemall.account.service;

import java.util.List;

import com.simplemall.micro.serv.common.bean.account.AccAddress;
import com.simplemall.micro.serv.common.bean.account.Account;

public interface IAccountService {

	/**
	 * @param phone
	 * @param password
	 * @return
	 */
	Account login(String phone, String password);
	
	/**
	 * @param phone
	 * @param password
	 * @return
	 */
	boolean signup(String phone, String password);
	
	/**
	 * @param tid
	 * @return
	 */
	AccAddress getAccAddress(String tid);
	
	/**
	 * @param accountId
	 * @return
	 */
	List<AccAddress> getAddressList(String accountId);
}
