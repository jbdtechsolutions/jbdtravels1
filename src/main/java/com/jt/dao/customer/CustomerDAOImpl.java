package com.jt.dao.customer;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.jt.bean.customer.Customer;
import com.jt.bean.trip.Trip;
import com.jt.constants.CustomerConstants;
import com.jt.constants.TripConstants;
import com.jt.dao.trip.TripMapper;

public class CustomerDAOImpl extends JdbcDaoSupport implements CustomerDAO {

	@Override
	public void createCustomer(Customer customer) {
		String SQL = CustomerConstants.INSERT_CUSTOMER;
		getJdbcTemplate().update(SQL, customer.custId, customer.custName);
		System.out.println("Created custome rrecord is: "+customer);
		return;
	}

	@Override
	public List<Customer> getAllCustomer() {
		String SQL = CustomerConstants.SELECT_ALL_CUSTOMER;
		List<Customer>  customers = getJdbcTemplate().query(SQL, new CustomerMapper());
		return customers;
	}

}
