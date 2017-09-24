package com.jt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jt.bean.customer.Customer;

public class TripDataDao {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/jbdtravels";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "sathiya";
	Connection conn = null;
	Statement stmt = null;

	public void establishDBConnection() throws ClassNotFoundException,
			SQLException {
		// STEP 2: Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		// STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connection Eshtablished...");
	}

	
	public List<Customer> loadCustomerDetails() {
		List<Customer> custList = new ArrayList<Customer>();
		try {
			establishDBConnection();
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "select customerId,cname from customer";
			
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustId(rs.getString("customerId"));
				customer.setCustName(rs.getString("cname"));
				custList.add(customer);

			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		//System.out.println("Goodbye!");

		return custList;
	}// end main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TripDataDao trip = new TripDataDao();
		//Customer customer = new Customer();
		List<Customer> customerDet = trip.loadCustomerDetails();
		
		System.out.println("Customer Details :");
		int i =0 ;
		for(Customer cst : customerDet){
			
			System.out.println(customerDet.get(i).getCustId() + "====" + customerDet.get(i).getCustName());
			i++;
		}

	}

}
