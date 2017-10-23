/**
 * 
 */
package com.citi.customerportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author Bootcamp User 014
 *
 */
@Entity
public class LoginCredentials {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String CardNumber;
	private String UserID;
	private String Password;
	@Transient
	private String ConfirmPassword;
	private int applictnId;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public int getApplictnId() {
		return applictnId;
	}
	public void setApplictnId(int applictnId) {
		this.applictnId = applictnId;
	}
}
