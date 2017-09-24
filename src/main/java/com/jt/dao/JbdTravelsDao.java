package com.jt.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.PreparedStatement;

import com.jt.bean.customer.Customer;

import java.sql.Connection;

import org.springframework.stereotype.Repository;

@Repository
public class JbdTravelsDao {

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

	public String valoidateLogin(String username, String password) {
		String loginresult = null;
		Map<String, String> dbresult = new HashMap<String, String>();
		try {
			establishDBConnection();
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "select username,password from jbdlogin";
			ResultSet rs = stmt.executeQuery(sql);
			String dbusername = null;
			String dbpassword = null;
			while (rs.next()) {
				dbusername = rs.getString("username");
				dbpassword = rs.getString("password");
				dbresult.put(dbusername, dbpassword);
				// dbresult.ad
				//

				System.out.print(", dbusername : " + dbusername
						+ "  dbpassword : " + dbpassword + "\n");

				if (dbusername.equalsIgnoreCase(username)
						&& dbpassword.equals(password)) {
					loginresult = "SUCCESS";
					break;

				} else {

					loginresult = "FAILED";
				}
				// String last = rs.getString("last");

				// Display values
				// System.out.print("ID: " + id);
				// System.out.print(", Age: " + age);

				// System.out.println(", Last: " + last);
			}

			/*
			 * for(int i=0;i < dbresult.size(); i++){
			 * 
			 * }
			 */

			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");

		return loginresult;
	}// end main

	public String sendCustomerDetails(Customer customer)
			throws ClassNotFoundException, SQLException {
		try {
			establishDBConnection();
			System.out.println("getCustId " + customer.getCustId());
			System.out.println("getCustName " + customer.getCustName());
			System.out.println("getPrimaryContact " + customer.getPrimaryContact());
			System.out.println("getSecondryContact " + customer.getSecondryContact());
			System.out.println("getEmail " + customer.getEmail()); 

			
			JbdTravelsDao jbddb = new JbdTravelsDao();
			jbddb.establishDBConnection();
			System.out.println("Inserting Customer Details...");
			
			String insertCustomer = "INSERT INTO `customer` (`customerId`,`cname`,`cmobile1`,`cmobile2`,`cemail`) VALUES ('"
					+ customer.getCustId()
					+ "', '"
					+ customer.getCustName()
					+ "', '"
					+ customer.getPrimaryContact()
					+ "', '"
					+ customer.getSecondryContact()
					+ "', '"
					+ customer.getEmail() + "')";
			
			System.out.println(insertCustomer);
			
			System.out.println("Inserting Customer Address Details...");
			
			String insertAddress = "INSERT INTO `caddress` (`customerId`,`caddtype`,`cdoornum`,`cstreet1`,`cstreet2`,`caddlandmark`,`ctown`,`ccity`,`caddothers`) VALUES ('"
					+ customer.getCustId()
					+ "', '"
					+ customer.getCustAdd().getAddressType()
					+ "', '"
					+ customer.getCustAdd().getDoorNo()
					+ "', '"
					+ customer.getCustAdd().getStreet1()
					+ "', '"
					+ customer.getCustAdd().getStreet2()
					+ "', '"
					+ customer.getCustAdd().getLandMark()
					+ "', '"
					+ customer.getCustAdd().getSub_location()
					+ "', '"
					+ customer.getCustAdd().getCity()
					+ "', '"
					+ customer.getCustAdd().getAddressOthers() + "')";
			
			System.out.println(insertAddress);
			PreparedStatement preparedStmt  = conn.prepareStatement(insertCustomer);
			preparedStmt.execute();
			System.out.println("Customer Personal Details Sussfully Inserted...");
			System.out.println("Executing Customer Address Details...");
			preparedStmt = conn.prepareStatement(insertAddress);
			preparedStmt.execute();
			System.out.println("Customer Address Details Sussfully Inserted...");
			//System.out.println("Customer Details Sussfully Inserted...");
			// .prepareStatement(insertCustomer);

			// CALL DAO LAYER
			System.out.println("Customer Details Sussfully Inserted...");

			preparedStmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		
		return "SUCCESS";
	}

	public static void main(String[] args) {

		JbdTravelsDao dbobj = new JbdTravelsDao();

		String result = dbobj.valoidateLogin("admin", "admin1");
		System.out.println("Login Result : " + result);
		Customer customer = new Customer();
		
		customer.getCustId();
		//customer.setCustAdd(custAdd);
		//dbobj.sendCustomerDetails(customer);
	}
}// end FirstExample