package com.bcj.creditcardsample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Applicant {
	
 @Id
 @GeneratedValue
 private int id;
 private String firstName;
 private String lastName;
 private String job;
 
 
 
@Override
public String toString() {
	return "Applicant [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", job=" + job + "]";
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
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
} 

}
