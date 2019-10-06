package com;

//Create an employee object and compare the object only by id. Override equals and hash code method.
public class EqualsandHashCode {

	private int empId;
	private String empName;
	private String companyName;
	
	public EqualsandHashCode(int empId,String empName,String companyName) {
		this.empId =empId;
		this.empName=empName;
		this.companyName=companyName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "EqualsandHashCode [empId=" + empId + ", empName=" + empName + ", companyName=" + companyName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsandHashCode other = (EqualsandHashCode) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	
	
}
