package com.jt.test;

import com.jt.bean.customer.Address;
import com.jt.bean.customer.Customer;
import com.jt.bean.customer.CustomerAccount;

public class TestBusiness {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Address address = new  Address();
		address.setAddressOthers("Others - Test");
		address.setAddressType("PERMANENT");
		address.setCity("NKL");
		address.setDoorNo("30A");
		address.setLandMark("Opp. to Vegani Electronicss Road");
		address.setPincode(621207);
		address.setStreet1("East St");
		address.setSub_location("TRY");
		customer.setAutoNum(100001);
		customer.setCustAdd(address);
		

		CustomerAccount accountId = new CustomerAccount();
		
		
		//String result = JBDController.sendCustomerDetails(customer);
		System.out.println("getCustId : " + customer.getCustId());
		
	}

}
