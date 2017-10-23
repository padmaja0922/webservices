package com.bcj.creditcard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class CreditCard {
	
	@Id
	@GeneratedValue
	private int id;
	private int cId;
	private String cardNo;
	private String name;
	private int cvvNo;
	private float creditLimit;
	private String expDate;
	private String status;
	
 
		
	
	
	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", cId=" + cId + ", cardNo=" + cardNo + ", name=" + name + ", cvvNo=" + cvvNo
				+ ", creditLimit=" + creditLimit + ", expDate=" + expDate + ", status=" + status + "]";
	}
	
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
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}


	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	

}
