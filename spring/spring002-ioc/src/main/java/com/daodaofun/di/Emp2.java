package com.daodaofun.di;

public class Emp2 {

	private Integer empno;

	private String name;

	private Integer sal;
	
	public Emp2() {
	}
	
	


	public Emp2(String name, Integer sal) {
		super();
		this.name = name;
		this.sal = sal;
	}



	public Emp2(Integer empno, String name) {
		super();
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

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}




	@Override
	public String toString() {
		return "Emp2 [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}

	
	 

}
