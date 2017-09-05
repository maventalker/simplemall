package com.simplemall.micro.serv.page.aop;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.simplemall.micro.serv.page.security.JWTUtils;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Aspect
@Order(0)
@Component
public class APISecurityCheck {

	/**
	 * 客户端给出的签名字段
	 */
	private static final String access_token = "accessToken";

	/**
	 * 前置通知：所有接口在执行业务之前，需要先进行参数合法性校验 执行顺序为1
	 * 
	 * @param joinPoint
	 * @throws Exception 
	 * @throws BusinessException
	 */
	@Before("execution(public * com.zhishi.rest.api.*.* (..))")
	public void doBeforeInService(JoinPoint joinPoint) throws Exception {
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes sra = (ServletRequestAttributes) ra;
		HttpServletRequest request = sra.getRequest();
		// 需要过滤URI的请求，有些不需要token的地方直接跳过不再校验
		String requestPath = request.getRequestURI(); // 请求的URL

		Map<String, String[]> inputParamMap = request.getParameterMap();
		Iterator<String> keyIter = inputParamMap.keySet().iterator();
		while (keyIter.hasNext()) {
			String currKey = keyIter.next();
			String value = ((String[]) inputParamMap.get(currKey))[0].toString();
			if (access_token.equals(currKey)) {
				try {
					JWTUtils.parseJWT(value);
				} catch (ExpiredJwtException | UnsupportedJwtException | MalformedJwtException | SignatureException
						| IllegalArgumentException exception) {
					throw new Exception("token校验失败！");
				}
			}
			System.out.println("---" + currKey + "------------" + value + "--------");
		}
	}
}
