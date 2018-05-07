package com.daodaofun.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daodaofun.bean.Girl;
import com.daodaofun.bean.PrettyGirl;

public class TestBasic {

	
	@Test
	public void m1() {
		// 1 获取spring上下文容器实例
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-basic.xml");
		// 通过bean元素的id属性的值获取 对应的实例
		Girl girl = (Girl) ctx.getBean("girl2");
		System.out.println(girl);
		//ctx没有注定销毁容器的方法。
		// 向上转型执行关闭方法
//		((ClassPathXmlApplicationContext)ctx).close();
		// 销毁方法，已过时
//		((ClassPathXmlApplicationContext)ctx).destroy();
	}
}



