package com.jt.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.jt.bean.customer.Customer;

public class JBDCoreBusiness {
Customer customer = new Customer();
// JDBC driver name and database URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/jbdtravels";

// Database credentials
static final String USER = "root";
static final String PASS = "sathiya";
Connection conn = null;
Statement stmt = null;

public String generateCustomerId(String location) throws ClassNotFoundException, SQLException{
	Integer autoInc = 000001;
	DateFormat dateFormat = new SimpleDateFormat("YYMMdd");
	Date today = new Date();
	//System.out.println("autoIncNumber :" + autoIncNumber);
	
	//SET LOCATION HERE B/W CITY and SUB-LOCATION VALUE
	//GET & SET AUTO INC VALUE HERE
	
	Class.forName("com.mysql.jdbc.Driver");
	// STEP 3: Open a connection
	System.out.println("Connecting to database...");
	conn = DriverManager.getConnection(DB_URL, USER, PASS);
	System.out.println("Connection Eshtablished...");
	System.out.println("Creating statement...");
	stmt = conn.createStatement();
	String sql;
	sql = "SELECT customerId FROM CUSTOMER ORDER BY customerId DESC LIMIT 1";
	
	ResultSet rs = stmt.executeQuery(sql);
	String maxId = null;
	
	while (rs.next()) {
		maxId = rs.getString("customerId");
		autoInc = Integer.parseInt(maxId.substring(maxId.length()-3).toString()) +1 ;
	}
	
	String custId = location.substring(0, 3).toUpperCase() + dateFormat.format(today).toString() + autoInc.toString();

	/*	while(custId.length() < 15){
			custId.concat("*");
		}*/
		customer.setCustId(custId);
	
	return custId;
}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		JBDCoreBusiness jbdcore = new JBDCoreBusiness();
		String location = "KTP";
		String result = jbdcore.generateCustomerId(location);
		System.out.println("result : " + result);
	}
}
