package com.jt.dao.trip;

import java.util.List;
import com.jt.bean.trip.Trip;

public interface TripDAO {
	
	public void createTrip(String tripId, String travelTo);
	public Trip getTrip(String tripId);
	public List<Trip> listTrips();
	public void deleteTrip(Integer id);
	
}