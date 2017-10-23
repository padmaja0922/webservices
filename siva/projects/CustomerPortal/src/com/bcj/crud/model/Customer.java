package com.bcj.crud.model;

public class Customer {
	String fName;
	String lName;
	String email;
	String nmbr;
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNmbr() {
		return nmbr;
	}
	public void setNmbr(String nmbr) {
		this.nmbr = nmbr;
	}

}
