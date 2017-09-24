package com.jt.constants;

import org.apache.log4j.Logger;

import com.jt.dao.trip.TripMapper;

public class BalanceConstants {
	private final static Logger logger = Logger.getLogger(BalanceConstants.class);
	
	public static final String SELECT_BALANCE_TRIP = "SELECT * FROM TRIP WHERE TRIPID=?";
	public static final String SELECT_ALL_BALANCE_TRIP = "SELECT * FROM BALANCE";
	
	
	
}
