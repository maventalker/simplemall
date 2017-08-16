package com.simplemall.account.service;

public interface IAccountService {

	/**
	 * @param phone
	 * @param password
	 * @return
	 */
	String login(String phone, String password);
	
	/**
	 * @param phone
	 * @param password
	 * @return
	 */
	String signup(String phone, String password);
	
	String getAccAddress();
}
