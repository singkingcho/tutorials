package com.daodaofun.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daodaofun.autowire.Boy;
import com.daodaofun.bean.Girl;
import com.daodaofun.bean.PrettyGirl;
import com.daodaofun.di.Emp;
import com.daodaofun.di.Emp2;

public class TestDi {

	
	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di.xml");
		Emp e = (Emp) ctx.getBean("emp3");
		System.out.println(e);
	}
	
	@Test
	public void m2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di.xml");
		Emp2 e = (Emp2) ctx.getBean("emp4");
		System.out.println(e);
	}
}



