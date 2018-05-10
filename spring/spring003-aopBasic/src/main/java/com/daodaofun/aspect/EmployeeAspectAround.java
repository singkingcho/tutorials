package com.daodaofun.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspectAround {

	
	@Around("execution(public String   getName())")
	public Object getNameAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("环绕执行前"); 
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕执行后");
		return null;
	}
}
