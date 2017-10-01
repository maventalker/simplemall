package com.simplemall.micro.serv.common.constant;

/**
 * 系统常量
 * 
 * @author guooo
 *
 */
public interface SystemConstants {
	public static final String API_KEY = "9223a431a6e24355901e95a521bb3455";

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

	/**
	 * 配送方式
	 * 
	 * @author xingxing
	 *
	 */
	public static final class SHIP_WAY {
		public static final String FEDEX = "FEDEX";
		public static final String UPS = "UPS";
		public static final String DHL = "DHL";
	}
	
	/**
	 * redis中存储的需要校验token的uri的前缀
	 */
	public static final String URL_NEED_CHECK_KEY = "URL2CHK";
}
