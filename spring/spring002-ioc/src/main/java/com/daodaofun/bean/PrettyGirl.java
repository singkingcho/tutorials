package com.daodaofun.bean;

public class PrettyGirl extends Girl{
	
	private String longLeg;

	public String getLongLeg() {
		return longLeg;
	}

	public void setLongLeg(String longLeg) {
		this.longLeg = longLeg;
	}

	@Override
	public String toString() {
		return super.toString() + "PrettyGirl [longLeg=" + longLeg + "]";
	}

	 
	
	

}
