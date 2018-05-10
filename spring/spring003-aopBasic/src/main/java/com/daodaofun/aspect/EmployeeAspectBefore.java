package com.daodaofun.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectBefore {

	
	@After("execution(public String   getName())")
	public void getNameAdvice() {
		System.out.println("after  Executing Advice on getName()..........");
	}
}
