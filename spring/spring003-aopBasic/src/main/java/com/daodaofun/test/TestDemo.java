package com.daodaofun.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daodaofun.Employee;

public class TestDemo {

	
	@Test
	public void m1() {
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("beans.xml");
		Employee emplpolyee = (Employee) ctx.getBean("employee");
		emplpolyee.getName(); 
	}
	

	@Test
	public void m2() {
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("beans.xml");
		Employee emplpolyee = (Employee) ctx.getBean("employee");
		emplpolyee.getName(); 
	}
	
	@Test
	public void m3() {
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("beans.xml");
		Employee emplpolyee = (Employee) ctx.getBean("employee");
		emplpolyee.getName(); 
	}
	
	@Test
	public void m4() {
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("beans.xml");
		Employee emplpolyee = (Employee) ctx.getBean("employee");
		emplpolyee.throwException();
	}
}
