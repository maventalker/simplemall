package com.simplemall.micro.serv.order.service;

import com.simplemall.micro.serv.common.bean.order.OrderDTO;

/**
 * 订单服务类
 * 
 * @author guooo
 *
 */
public interface IOrderService {

	/**
	 * 创建
	 * 
	 * @param orderJsonStr
	 *            订单json串
	 * @return
	 */
	boolean create(String orderJsonStr);

	/**
	 * 查看
	 * 
	 * @param serialNo
	 * @param accountId
	 * @return
	 */
	OrderDTO view(String serialNo, String accountId);

	/**
	 * 订单状态变更
	 * 
	 * @param serialNo
	 * @param state
	 * @param orderStatus
	 * @return
	 */
	boolean changeOrderState(String serialNo, String state, String orderStatus);
}
