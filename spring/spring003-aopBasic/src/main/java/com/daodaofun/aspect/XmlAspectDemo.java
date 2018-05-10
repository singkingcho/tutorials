package com.daodaofun.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAspectDemo {

	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("xml aspect around 之前。。。。。。。。。");
		Object value = null;
		
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("xml aspect around 之后");
		return value;
		
	}
}
