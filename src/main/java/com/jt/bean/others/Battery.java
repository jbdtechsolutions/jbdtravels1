package com.jt.bean.others;

import com.jt.bean.vehicle.Vehicle;

public class Battery {
	
	public String batteryNumber;
	public String batteryManufacturer;
	public String buyingDate;
	public Integer batteryPrice;
	public Vehicle vehicle;
	
	public Integer getBatteryPrice() {
		return batteryPrice;
	}

	public void setBatteryPrice(Integer batteryPrice) {
		this.batteryPrice = batteryPrice;
	}

	public String getBatteryNumber() {
		return batteryNumber;
	}

	public void setBatteryNumber(String batteryNumber) {
		this.batteryNumber = batteryNumber;
	}

	public String getBatteryManufacturer() {
		return batteryManufacturer;
	}

	public void setBatteryManufacturer(String batteryManufacturer) {
		this.batteryManufacturer = batteryManufacturer;
	}

	public String getBuyingDate() {
		return buyingDate;
	}

	public void setBuyingDate(String buyingDate) {
		this.buyingDate = buyingDate;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
