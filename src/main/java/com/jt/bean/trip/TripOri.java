package com.jt.bean.trip;

import com.jt.bean.customer.Customer;
import com.jt.bean.employee.Employee;
import com.jt.bean.vehicle.Vehicle;

public class TripOri {

	/*
	 * public String customerId = null; public String customerName = null;
	 * public String customerContact = null;
	 */

	public Customer customer;
	public Employee employee;
	public Vehicle vehicle;

	public String tripId = null;
	public String tripDate = null;
	public String travelFrom = null;
	public String travelTo = null;
	public Integer rentAmount = null;
	public Integer rentPaid = null;
	public Integer rentBalance = null;
	public Integer startingKm;
	public Integer endingKm;
	public Integer totalKm;
	public String tripStatus;

	/*
	 * public String driverName = null; public String driverId = null;
	 */
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getTravelFrom() {
		return travelFrom;
	}

	public void setTravelFrom(String travelFrom) {
		this.travelFrom = travelFrom;
	}

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

	public String getTripDate() {
		return tripDate;
	}

	public void setTripDate(String tripDate) {
		this.tripDate = tripDate;
	}

	public Integer getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(Integer rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Integer getRentPaid() {
		return rentPaid;
	}

	public void setRentPaid(Integer rentPaid) {
		this.rentPaid = rentPaid;
	}

	public Integer getRentBalance() {
		return rentBalance;
	}

	public void setRentBalance(Integer rentBalance) {
		this.rentBalance = rentBalance;
	}

	public Integer getStartingKm() {
		return startingKm;
	}

	public void setStartingKm(Integer startingKm) {
		this.startingKm = startingKm;
	}

	public Integer getEndingKm() {
		return endingKm;
	}

	public void setEndingKm(Integer endingKm) {
		this.endingKm = endingKm;
	}

	public Integer getTotalKm() {
		return totalKm;
	}

	public void setTotalKm(Integer totalKm) {
		this.totalKm = totalKm;
	}

	public String getTripStatus() {
		return tripStatus;
	}

	public void setTripStatus(String tripStatus) {
		this.tripStatus = tripStatus;
	}

	public TripOri() {

	}

	public String toString() {
		/*
		 * return "{\"customer\" :" + customer + ", employee :" + employee +
		 * ",vehicle:" + vehicle + ",tripId:" + tripId + ",tripDate:" + tripDate
		 * + ", travelFrom:" + travelFrom + ",travelTo:" + travelTo +
		 * ",rentAmount:" + rentAmount + ",rentPaid:" + rentPaid +
		 * ",rentBalance:" + rentBalance + ",startingKm:" + startingKm +
		 * ",endingKm:" + endingKm + ",totalKm:" + totalKm + ",tripStatus:" +
		 * tripStatus + "}";
		 */

/*		return "{\"customer\":\"" + customer + "\",\"employee\":\"" + employee + "\",\"vehicle\":\"" + vehicle
				+ "\",\"tripId\":\"" + tripId + "\",\"tripDate\":\"" + tripDate + "\",\"travelFrom\":\"" + travelFrom
				+ "\",\"travelTo\":\"" + travelTo + "\",\"rentAmount\":\"" + rentAmount + "\",\"rentPaid\":\"" + rentPaid
				+ "\",\"rentBalance\":\"" + rentBalance + "\",\"startingKm\":\"" + startingKm + "\",\"endingKm\":\""
				+ endingKm + "\",\"totalKm\":\"" + totalKm + "\",\"tripStatus\":\"" + tripStatus + "\"}";*/
		
		return "{\"tripId\":\""+tripId+"\",\"travelTo\":\""+travelTo+"\"}";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
