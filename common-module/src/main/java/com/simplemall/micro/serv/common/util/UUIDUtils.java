package com.simplemall.micro.serv.common.util;

import java.util.UUID;

/** uuid utils
 * @author Guooo
 * 2017年8月23日 上午6:17:01
 */
public class UUIDUtils {

	public  static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
