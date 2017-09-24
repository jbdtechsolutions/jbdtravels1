package com.jt.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jt.bean.customer.Customer;
import com.jt.service.customer.CustomerService;

@RestController
public class CustomerController {
	CustomerService customerService;
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public List<Customer> getAllCustomer(){
		List<Customer> customers = customerService.getAllCustomerService();
		return customers;
	}

	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public void addNewCustomer(){
		
	}

	
}
