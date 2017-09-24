package com.jt.bean.trip;

public class Trip {

	public String tripId = null;

	public String travelTo = null;


	public String getTravelTo() {
		return travelTo;
	}

	public void setTravelTo(String travelTo) {
		this.travelTo = travelTo;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public Trip() {
	}

	public String toString() {
		 System.out.println("Called toString():" + "{\"tripId\":\""+tripId+"\",\"travelTo\":\""+travelTo+"\"}" );
		 
		return "{\"tripId\":\""+tripId+"\",\"travelTo\":\""+travelTo+"\"}";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Trip tr = new Trip();
		 tr.setTravelTo("KTP");
		 tr.setTripId("KTP005");
		 
		 System.out.println(tr.toString());
	}

}
