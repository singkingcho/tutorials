package com.daodaofun.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspectThrowIng {

	
	@AfterThrowing("execution(public void   throwException())")
	public void getNameAdvice() {
		System.out.println("after Throwing  Executing Advice ..........");
	}
}
