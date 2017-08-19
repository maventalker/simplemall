package com.simplemall.micro.serv.common.constant;

/**
 * 系统常量
 * 
 * @author guooo
 *
 */
public interface SystemConstants {

	public static final class Code {
		public static final String SUCCESS = "1";

		public static final String FAIL = "0";
		/**
		 * @Fields ok : 成功
		 */
		public static final int success = 1;
		/**
		 * @Fields error : 失败
		 */
		public static final int error = 0;
	}

	/**
	 * 订单状态
	 * 
	 * @author guooo
	 *
	 */
	public static final class STATE {

		/**
		 * 创建
		 */
		public static final String CREATE = "CREATE";

		/**
		 * 配送中
		 */
		public static final String SHIPPING = "SHIPPING";

		/**
		 * 关闭
		 */
		public static final String CLOSED = "CLOSED";

		/**
		 * 完成
		 */
		public static final String FINISHED = "FINISHED";
	}

	/**
	 * 支付状态
	 * 
	 * @author guooo
	 *
	 */
	public static final class PAY_STATUS {

		/**
		 * 未支付
		 */
		public static final String UNPAY = "UNPAY";

		/**
		 * 已支付
		 */
		public static final String PAID = "PAID";

	}

	/**
	 * 支付类型
	 * 
	 * @author guooo
	 *
	 */
	public static final class PAY_TYPE {

		/**
		 * 支付宝
		 */
		public static final String ALIPAY = "ALIPAY";

		/**
		 * 财富通
		 */
		public static final String TENPAY = "TENPAY";

		/**
		 * 银行卡
		 */
		public static final String CARD = "CARD";

	}
}
