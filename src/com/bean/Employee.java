package com.bean;

public class Employee {
	
	private int eid;
	private String name,designation;
	private float salary;
	
	//getters and setters
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee Details:eid=" + eid + ", name=" + name + ", designation=" + designation + ", salary=" + salary;
	}
	
	
	
	

}
