package com.jt.dao.customer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.jt.bean.customer.Customer;
import com.jt.bean.trip.Trip;

public class CustomerMapper implements RowMapper<Customer>{
	private final static Logger logger = Logger.getLogger(CustomerMapper.class);
	
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustId(rs.getString("custId"));
		customer.setCustName(rs.getString("custName"));
		return customer;
	}
	
}
