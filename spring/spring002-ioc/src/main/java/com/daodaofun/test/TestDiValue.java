package com.daodaofun.test;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daodaofun.autowire.Boy;
import com.daodaofun.bean.Girl;
import com.daodaofun.bean.PrettyGirl;
import com.daodaofun.di.Emp;
import com.daodaofun.di.Emp2;
import com.daodaofun.divalue.MyArray;
import com.daodaofun.divalue.MyList;
import com.daodaofun.divalue.MyMap;
import com.daodaofun.divalue.MyNull;
import com.daodaofun.divalue.MyProp;
import com.daodaofun.divalue.MySet;

public class TestDiValue {

	
	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di-value.xml");
		MyArray array = (MyArray) ctx.getBean("myArray");
		System.out.println(Arrays.toString(array.getNums()));
	}
	
	
	
	
	@Test
	public void m2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di-value.xml");
		MyList l =  (MyList) ctx.getBean("myList");
		System.out.println(l.getDogs());
	}
	
	
	@Test
	public void m3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di-value.xml");
		MyMap map =   (MyMap) ctx.getBean("myMap");
		System.out.println(map.getMap());
	}
	
	
	@Test
	public void m4() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di-value.xml");
		MyProp myProp =	(MyProp) ctx.getBean("myProp");
		System.out.println(myProp.getProperties());
	}
	
	
	@Test
	public void m5() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di-value.xml");
		MySet mySet = (MySet) ctx.getBean("mySet");
		System.out.println(mySet.getOrderNos());
	}
	
	
	@Test
	public void m6() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di-value.xml");
		MyNull myNull =   (MyNull) ctx.getBean("myNull");
//		System.out.println(myNull.getLover().equals("null"));
		System.out.println(myNull.getLover() == null);
	}
}



