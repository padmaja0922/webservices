package com.bcj.ajaxrest.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class CustomerView {
	
	
	private int id;
	private String firstName;
	private String lastName;
	
	
	
	@Override
	public String toString() {
		return "CustomerView [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
