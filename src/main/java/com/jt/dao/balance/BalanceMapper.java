package com.jt.dao.balance;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.jt.bean.balance.Balance;

public class BalanceMapper implements RowMapper<Balance>{
	private final static Logger logger = Logger.getLogger(BalanceMapper.class);
	
	@Override
	public Balance mapRow(ResultSet rs, int rowNum) throws SQLException {
		Balance balance = new Balance();
		balance.setTripId(rs.getString("tripId"));
		balance.setBalanceAmount(rs.getLong("balaneAmt"));
		return balance;
	}
	
}
