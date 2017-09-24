package com.jt.bean.customer;

public class Customer {

	public String custId = "";
	public String custName = "";
	public String primaryContact;
	public String secondryContact;
	public String email = "";
	public Integer autoNum = 0;
	public Address custAdd;
	public CustomerType custType;
	
	public String getCustId() {
		return custId;
	}


	public void setCustId(String custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
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


	public Address getCustAdd() {
		return custAdd;
	}


	public void setCustAdd(Address custAdd) {
		this.custAdd = custAdd;
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
	
	public static void main(String[] args) {
		Customer cust = new Customer();
		Integer primaryContact = 0;
		Integer secondryContact = 0;
		Address custAdd = new  Address();
		CustomerAccount accountId = new CustomerAccount();
		//String custId = core.generateCustomerId(cust);
		

		//cust.setCustId(custId);
		
		System.out.println("getCustId : " + cust.getCustId());
		
	}

}
