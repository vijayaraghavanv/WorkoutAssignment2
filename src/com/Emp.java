package com;

//Create a class Employee and load a list of employee and convert it into map which takes Emp id as key and the object itself as value.
public class Emp {
	private int empid;
	private String name;
	private String address;
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid = empid;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
