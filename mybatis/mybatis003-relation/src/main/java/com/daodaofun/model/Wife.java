package com.daodaofun.model;

import java.io.Serializable;

/**
 * 2018年5月6日20:38:13
 * 妻子类
 * 【目的】：描述一对一的关系（与丈夫）
 * @author qiudaozhang
 *
 */
public class Wife  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7040954102230642971L;

	private Integer id;
	
	private String name;
	
	private Husband husband;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Wife [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
}
