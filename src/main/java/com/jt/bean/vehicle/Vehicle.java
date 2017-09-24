package com.jt.bean.vehicle;

import com.jt.bean.trip.Trip;

public class Vehicle {

	public String vehicleNumber;
	public String vehicleColor;
	public String vehicleChaseNumber;
	public String vehicleType;
	public Integer currentKilometer;
	
		
	public String getVehicleNumber() {
		return vehicleNumber;
	}



	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}



	public String getVehicleColor() {
		return vehicleColor;
	}



	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}



	public String getVehicleChaseNumber() {
		return vehicleChaseNumber;
	}



	public void setVehicleChaseNumber(String vehicleChaseNumber) {
		this.vehicleChaseNumber = vehicleChaseNumber;
	}



	public String getVehicleType() {
		return vehicleType;
	}



	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}



	public Integer getCurrentKilometer() {
		return currentKilometer;
	}



	public void setCurrentKilometer(Trip trip) {
		//this.currentKilometer = trip.endingKm;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
