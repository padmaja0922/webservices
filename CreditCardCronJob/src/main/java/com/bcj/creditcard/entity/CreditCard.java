package com.bcj.creditcard.entity;

import javax.persistence.Entity;




@Entity
public class CreditCard {
	
	
	private int id;
	private String cardNo;
	private String name;
	private int cvvNo;
	private String expDate;
	
	

	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	@Override
	public String toString() {
		return "CreditCard [cardNo=" + cardNo + ", name=" + name + ", cvvNo=" + cvvNo + ", expDate=" + expDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	

}
