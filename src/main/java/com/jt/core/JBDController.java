package com.jt.core;

import java.sql.SQLException;

import com.jt.bean.customer.Customer;
import com.jt.dao.JbdTravelsDao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JBDController {
	
	
	
	public static String sendCustomerDetails(Customer customer) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement preparedStmt = null;
		JbdTravelsDao jbddb = new JbdTravelsDao();
		jbddb.establishDBConnection();
		String insertCustomer= "";
		String insertAddress= "";
		//preparedStmt = conn.prepareStatement(insertCustomer);
		//.prepareStatement(insertCustomer);
		
		// CALL DAO LAYER
		
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
