package com.daodaofun.autowire;

import com.daodaofun.bean.Girl;

public class Boy {

	
	private String name;
	
	private Girl girl;
	
	public Boy() {
	}
	

	public Boy(String name, Girl girl) {
		super();
		this.name = name;
		this.girl = girl;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Girl getGirl() {
		return girl;
	}

	public void setGirl(Girl girl) {
		this.girl = girl;
	}

	@Override
	public String toString() {
		return "Boy [name=" + name + ", girl=" + girl + "]";
	}
	
	
	 
}
