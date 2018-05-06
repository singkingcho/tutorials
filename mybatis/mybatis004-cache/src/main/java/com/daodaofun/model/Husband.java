package com.daodaofun.model;

import java.io.Serializable;

/**
 * 2018年5月6日20:37:47
 * 丈夫实体类
 * 【目的】：描述一对一的关系（与wife）
 * @author qiudaozhang
 *
 */
public class Husband implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3261315625060976317L;

	private Integer id;
	
	private String name;
	
	private Wife wife;

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

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	
	@Override
	public String toString() {
		return "Husband [id=" + id + ", name=" + name + ", wife=" + wife + "]";
	}
	
	
	
	
}
