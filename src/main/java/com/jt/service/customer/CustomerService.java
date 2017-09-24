package com.jt.service.customer;

import java.util.List;

import com.jt.bean.customer.Customer;
import com.jt.dao.customer.CustomerDAOImpl;

public class CustomerService {
	CustomerDAOImpl customerDAOImpl;

	public CustomerDAOImpl getCustomerDAOImpl() {
		return customerDAOImpl;
	}

	public void setCustomerDAOImpl(CustomerDAOImpl customerDAOImpl) {
		this.customerDAOImpl = customerDAOImpl;
	}
	
	public List<Customer> getAllCustomerService(){
		List<Customer> allCustomer = customerDAOImpl.getAllCustomer();
		//send trip balance
		return allCustomer;
	}
	
//	public Trip getTripDetails(String tripId){
//		Trip trip = tripdao.getTrip(tripId);
//		return trip;
//	}
	
	public String addCustomerService(Customer customer){
		customerDAOImpl.createCustomer(customer);
		String response = "{\"status\":\"success\"}";
		return response;
	}
}
