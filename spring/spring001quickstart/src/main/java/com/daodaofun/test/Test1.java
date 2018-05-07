package com.daodaofun.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daodaofun.bean.Girl;

public class Test1 {

	
	@Test
	public void m1() {
		// 1 获取spring上下文容器实例
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-1.xml");
		// 通过bean元素的id属性的值获取 对应的实例
		Girl girl = (Girl) ctx.getBean("girl");
		System.out.println(girl);
	}
}



