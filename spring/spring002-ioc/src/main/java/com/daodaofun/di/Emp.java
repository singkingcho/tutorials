package com.daodaofun.di;

public class Emp {

	private Integer empno;

	private String name;

	private Double sal;

	
	public Emp() {
	}
	
	public Emp(Integer empno, String name) {
		this.empno = empno;
		this.name = name;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}

}
