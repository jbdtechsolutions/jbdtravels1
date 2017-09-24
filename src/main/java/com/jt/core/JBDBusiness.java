package com.jt.core;

import com.jt.bean.customer.Customer;

public interface JBDBusiness {
	boolean validateCustomerId(Customer customer);
	boolean validateCustMobile(Customer customer);
	boolean validateCustContactEntry(Customer customer);
	boolean validateCustomerIdEntry(Customer customer);
}
