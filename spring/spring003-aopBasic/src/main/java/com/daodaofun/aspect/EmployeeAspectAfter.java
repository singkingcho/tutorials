package com.daodaofun.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 标记为一个切面类
@Aspect
public class EmployeeAspectAfter {

	
	// 标记为一个建议，为前置通知 execution括号内部跟随表达式
	@Before("execution(public String   getName())")
	public void getNameAdvice() {
		System.out.println("before Executing Advice on getName()..........");
	}
}
