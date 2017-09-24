package com.jt.bean.employee;

import com.jt.bean.customer.Address;


public class Employee {
	public String empId = "";
	public String empName = "";
	public String primaryContact;
	public String secondryContact;
	public String email = "";
	public Integer autoNum = 0;
	public Address empAdd;
	public EmployeeType empType;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getSecondryContact() {
		return secondryContact;
	}

	public void setSecondryContact(String secondryContact) {
		this.secondryContact = secondryContact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAutoNum() {
		return autoNum;
	}

	public void setAutoNum(Integer autoNum) {
		this.autoNum = autoNum;
	}

	public Address getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(Address empAdd) {
		this.empAdd = empAdd;
	}

	public EmployeeType getEmpType() {
		return empType;
	}

	public void setEmpType(EmployeeType empType) {
		this.empType = empType;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
