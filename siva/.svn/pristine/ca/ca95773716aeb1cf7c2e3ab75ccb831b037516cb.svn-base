package com.citi.customerportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCard {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int ccId;
	private String creditCardNumber;
	private String nameOnCard;
	private String expiryDate;
	private String CVV;
	private double cardLimit;
	private int custId;
	private String cardStatus;
	public int getCcId() {
		return ccId;
	}
	public void setCcId(int ccId) {
		this.ccId = ccId;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCVV() {
		return CVV;
	}
	public void setCVV(String cVV) {
		CVV = cVV;
	}
	public double getCardLimit() {
		return cardLimit;
	}
	public void setCardLimit(double cardLimit) {
		this.cardLimit = cardLimit;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	@Override
	public String toString() {
		return "CreditCard [ccId=" + ccId + ", creditCardNumber=" + creditCardNumber + ", nameOnCard=" + nameOnCard
				+ ", expiryDate=" + expiryDate + ", CVV=" + CVV + ", cardLimit=" + cardLimit + ", custId=" + custId
				+ ", cardStatus=" + cardStatus + "]";
	}
	
}
