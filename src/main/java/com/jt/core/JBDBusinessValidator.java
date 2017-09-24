package com.jt.core;

import com.jt.bean.customer.Address;
import com.jt.bean.customer.Customer;
import com.jt.bean.customer.CustomerAccount;

public class JBDBusinessValidator implements JBDBusiness{
	
	CustomerAccount accId = new  CustomerAccount();
	Customer custr = new Customer();
	boolean result = false;
	
	void initialiseValues(){
		
	}
	@Override
	public boolean validateCustomerId(Customer customer) {
		if(customer.getCustId().length() > 15 || customer.getCustId().length() < 15){
			System.out.println("Customer ID Cannot be more / less than 15 characters");
			result  =true;
		}
		return result;
	}

	@Override
	public boolean validateCustMobile(Customer customer) {
		if(customer.getPrimaryContact().length() > 10 || customer.getPrimaryContact().length() < 10){
			System.out.println("Please Enter Valid Mobile Number");
			result = true;
		}
		return result;
	}

	@Override
	public boolean validateCustContactEntry(Customer customer) {
		if(customer.getPrimaryContact().toString().length() == 0){
			System.out.println("Please Enter Valid Contact Number / Primary Contact Number Cannot be Empty");
			result = true;
		}
		return result;
	}

	@Override
	public boolean validateCustomerIdEntry(Customer customer) {
		if(customer.getCustId().length()==0){
			System.out.println("Please Enter Customer Details, Customer ID generation Failed");
			result  =true;
		}
		return result;
	}

	public static void main(String[] args) {
		JBDBusinessValidator jbdVal = new JBDBusinessValidator();
		Customer customer = new Customer();
		CustomerAccount custAcc = new CustomerAccount();
		Address addre = new Address();
		//addre.setCity("TRY");
		//customer.setAutoNum(900000);
		//custAcc.generateCustomerId(customer.getCustAdd().getCity(), customer.getAutoNum());
		//customer.setAccountId(custAcc);
		//customer.setCustAdd(addre);
		//customer.setCustId(custAcc);
		//customer.setPrimaryContact("");
		//String validate = jbdVal.
		System.out.println(customer.getCustId());
		jbdVal.validateCustContactEntry(customer);
		
		

	}
}
