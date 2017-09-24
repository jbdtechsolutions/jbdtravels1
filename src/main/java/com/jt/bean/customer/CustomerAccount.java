package com.jt.bean.customer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerAccount {
Customer customer = new Customer();
	public String generateCustomerId(Customer customer){
		DateFormat dateFormat = new SimpleDateFormat("YYMMdd");
		Date today = new Date();
		//System.out.println("autoIncNumber :" + autoIncNumber);
		String custId = customer.getCustAdd().getCity() + dateFormat.format(today).toString() + customer.getAutoNum().toString();
		return custId;
	}
	
	public static void main(String[] args) {
		Customer customer = new  Customer();
		CustomerAccount ca = new CustomerAccount();
		String loc = "NKL";
		Integer autoInc = 112;
		customer.setAutoNum(1);
		Address address = new Address();
		address.setCity("KTP");
		customer.setCustAdd(address);
		System.out.println("New Cust Id Is : " + ca.generateCustomerId(customer));

	}

}
