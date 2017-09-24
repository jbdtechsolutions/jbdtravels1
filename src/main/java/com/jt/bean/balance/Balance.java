/**
 * 
 */
package com.jt.bean.balance;

/**
 * 
 *
 */
public class Balance {
	Long balanceAmount;
	String	tripId;
	
	
	public Long getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(Long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String toString() {

		return "{\"tripId\":\""+tripId+"\",\"balanceAmount\":\""+balanceAmount+"\"}";

	}

}
