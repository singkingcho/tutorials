package com.daodaofun.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daodaofun.autowire.Boy;
import com.daodaofun.bean.Girl;
import com.daodaofun.bean.PrettyGirl;

public class TestAutowire {

	
	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		Boy boy =  (Boy) ctx.getBean("boy");
		System.out.println(boy);
	}
}



