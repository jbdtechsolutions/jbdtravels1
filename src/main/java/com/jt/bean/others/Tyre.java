package com.jt.bean.others;

import com.jt.bean.vehicle.Vehicle;

public class Tyre {

	public String tyreNumber;
	public String tyreManufacturer;
	public String buyingDate;
	public Integer tyrePrice;
	public Vehicle vehicle;

	public String getTyreNumber() {
		return tyreNumber;
	}

	public void setTyreNumber(String tyreNumber) {
		this.tyreNumber = tyreNumber;
	}

	public String getTyreManufacturer() {
		return tyreManufacturer;
	}

	public void setTyreManufacturer(String tyreManufacturer) {
		this.tyreManufacturer = tyreManufacturer;
	}

	public String getBuyingDate() {
		return buyingDate;
	}

	public void setBuyingDate(String buyingDate) {
		this.buyingDate = buyingDate;
	}

	public Integer getTyrePrice() {
		return tyrePrice;
	}

	public void setTyrePrice(Integer tyrePrice) {
		this.tyrePrice = tyrePrice;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
