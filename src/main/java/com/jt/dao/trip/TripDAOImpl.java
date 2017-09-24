package com.jt.dao.trip;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.jt.bean.trip.Trip;
import com.jt.constants.TripConstants;


public class TripDAOImpl extends JdbcDaoSupport implements TripDAO {
	private final static Logger logger = Logger.getLogger(TripDAOImpl.class);
	

	public void createTrip(String tripId, String travelTo) {
		String SQL = TripConstants.INSERT_TRIP;
		getJdbcTemplate().update(SQL, tripId, travelTo);
		System.out.println("Created Record Trip ID = " + tripId + " Place = " + travelTo);
		return;
	}

	public Trip getTrip(String tripId) {
		String SQL = TripConstants.SELECT_TRIP;
		Trip trip = getJdbcTemplate().queryForObject(SQL, new Object[] { tripId }, new TripMapper());
		return trip;
	}

	public List<Trip> listTrips() {
		String SQL = TripConstants.SELECT_ALL_TRIP;
		List<Trip> trips = getJdbcTemplate().query(SQL, new TripMapper());
		return trips;
	}

	public void deleteTrip(Integer id) {
		String SQL = TripConstants.DELETE_TRIP;
		getJdbcTemplate().update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	public void updateTrip(String tripId, String place) {
		String SQL = TripConstants.UPDATE_TRIP;
		getJdbcTemplate().update(SQL, place, tripId);
		System.out.println("Updated Record with ID = " + tripId);
		return;
	}

}