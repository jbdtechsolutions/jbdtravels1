package com.jt.constants;

import org.apache.log4j.Logger;

import com.jt.dao.trip.TripMapper;

public class CustomerConstants {
	private final static Logger logger = Logger.getLogger(CustomerConstants.class);
	
	public static final String SELECT_TRIP = "SELECT * FROM TRIP WHERE TRIPID=?";
	public static final String SELECT_ALL_CUSTOMER = "SELECT * FROM CUSTOMER";
	public static final String INSERT_CUSTOMER = "INSERT INTO `JBDTVLSDB`.`CUSTOMER` (`CUSTOMERID`,`CUSTOMER_NAME`) VALUES (?,?)";
			//"INSERT INTO `JBDTVLSDB`.`TRIP` (`TRIPID`, `TRIP_DATE`, `CUSTOMER_NAME`, `CUSTOMER_MOBILE`, `TRIP_FROM`, `TRIP_TO`, `STARTING_KM`, `ENDING_KM`, `TOTAL_KM`, `TRIP_RENT`, `PAID_AMOUNT`, `TRIP_BALANCE`, `TRIP_STATUS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public static final String DELETE_TRIP = "DELETE FROM TRIP WHERE TRIPID = ?";
	public static final String UPDATE_TRIP = "UPDATE TRIP SET PLACE = ? WHERE TRIPID = ?";
	
	
}
