package com.bcj.creditcard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Login {
    
	@Id
	@GeneratedValue
	private int id;
	private String cardNo;
	private String userName;
	private String password;
	
	
	
	
	@Override
	public String toString() {
		return "Login [id=" + id + ", cardNo=" + cardNo + ", userName=" + userName + ", password=" + password + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	
	
	
		 
	
}
