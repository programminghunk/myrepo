package com.proj.beans;

public class Employee {
	
	private Long id;
	private String name;
	private String dept;
	private Long Salary;
	public Employee(Long id, String name, String dept, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		Salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	

}
