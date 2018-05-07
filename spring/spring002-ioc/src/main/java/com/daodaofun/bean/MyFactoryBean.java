package com.daodaofun.bean;

public class MyFactoryBean {

	
	public static   Girl getContent() {
		Girl girl = new Girl();
		girl.setName("工厂女孩");
		return  girl;
	}
}
