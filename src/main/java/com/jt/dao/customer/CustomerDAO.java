package com.jt.dao.customer;

import java.util.List;

import com.jt.bean.customer.Customer;

public interface CustomerDAO {
	public void createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
