package com.bcj.corejava.classes.medium.lab7;

public class Traveller {
	private int travellerId;
	private int baggageAmount;
	private int expiryYear;
	private boolean nocStatus;
	public int getTravellerId() {
		return travellerId;
	}
	public void setTravellerId(int travellerId) {
		this.travellerId = travellerId;
	}
	public int getBaggageAmount() {
		return baggageAmount;
	}
	public void setBaggageAmount(int baggageAmount) {
		this.baggageAmount = baggageAmount;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	public boolean isNocStatus() {
		return nocStatus;
	}
	public void setNocStatus(boolean nocStatus) {
		this.nocStatus = nocStatus;
	}

}
