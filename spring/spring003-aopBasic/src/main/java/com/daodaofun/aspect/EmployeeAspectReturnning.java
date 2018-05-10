package com.daodaofun.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspectReturnning {

	
	@AfterReturning("execution(public String   getName())")
	public void getNameAdvice() {
		System.out.println("after returnning  Executing Advice on getName()..........");
	}
}
