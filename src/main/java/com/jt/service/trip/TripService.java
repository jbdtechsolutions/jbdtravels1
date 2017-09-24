package com.jt.service.trip;

import java.util.ArrayList;
import java.util.List;
import com.jt.bean.trip.Trip;
import com.jt.dao.trip.TripDAOImpl;


public class TripService {

	TripDAOImpl tripdao;

	public TripDAOImpl getTripdao() {
		return tripdao;
	}

	public void setTripdao(TripDAOImpl tripdao) {
		this.tripdao = tripdao;
	}

	/*Load customer Name in drop down while entering trip details*/
	public List<String> loadCustomerName(){
		List<String> custNameList = new ArrayList<String>();
		//get all customer names here
		return custNameList;
	}
	
	/*Load customer Details by customer name */
	public List<String> loadCustomerDetails(String customerName){
		List<String> custDetails = new ArrayList<String>();
		//get customer Id by customer name here
		return custDetails;
	}
	
	public List<Trip> getAllTrips(){
		List<Trip> alltrip = tripdao.listTrips();
		//send trip balance
		return alltrip;
	}
	
	public Trip getTripDetails(String tripId){
		Trip trip = tripdao.getTrip(tripId);
		return trip;
	}
	
	public String addTripService(Trip newtrip){
		tripdao.createTrip(newtrip.tripId, newtrip.travelTo);
		String response = "{\"status\":\"success\"}";
		return response;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
