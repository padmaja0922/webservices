package com.citi.customerportal.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	private String fName;
	private String lName;
	private String telephoneNumber;
	private String email;
	private String dateOfBirth;
	private String ssn;
	private String processStatus = "NotApproved";
	private String applicationStatus = "New";
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Address_ID")
private Address address;

@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Financial_ID")
	private FinancialDetails financialinfo;
	
	
	
	public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public FinancialDetails getFinancialinfo() {
	return financialinfo;
}
public void setFinancialinfo(FinancialDetails financialinfo) {
	this.financialinfo = financialinfo;
}
	@Id 
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", telephoneNumber=" + telephoneNumber + ", email="
				+ email + ", dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", id=" + id + "]";
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
}
