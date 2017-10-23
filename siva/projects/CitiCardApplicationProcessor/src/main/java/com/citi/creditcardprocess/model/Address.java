package com.citi.creditcardprocess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "address") 
public class Address {

	@Id  
	@Column(name = "Address_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
  int id;
	

	String addressLine1;
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", state=" + state + ", zip=" + zip + "]";
	}
	String addressLine2;
	String city;
	String state;
	String zip;
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
