package com.jt.dao.trip;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.jt.bean.trip.Trip;

public class TripMapper implements RowMapper<Trip>{
	private final static Logger logger = Logger.getLogger(TripMapper.class);
	
	@Override
	public Trip mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trip trip = new Trip();
		trip.setTripId(rs.getString("tripId"));
		trip.setTravelTo(rs.getString("trip_to"));
		return trip;
	}
	
}
