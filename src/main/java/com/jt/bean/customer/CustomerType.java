package com.jt.bean.customer;

public class CustomerType {
	public String custType = null;

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}
	
	
	public static void main(String[] args) {
		CustomerType custTypeObj = new CustomerType();
		custTypeObj.setCustType("REGULAR");
		System.out.println("Get Customer Type: " + custTypeObj.getCustType());
	}
	
}
