package com.bcj.creditcard.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Customer {
	
	@Id
	private int Id;
	private String firstName;
	private String lastName;	
	private String dob;
	private String ssn;
	private String phone;
	private String email;
	private String status;		
	
	@OneToOne
    @JoinColumn(name = "aId")
	private EmploymentDetails empDetails;
	
	
	
	
	

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", ssn="
				+ ssn + ", phone=" + phone + ", email=" + email + ", status=" + status + ", empDetails=" + empDetails
				+ "]";
	}

	public Customer() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EmploymentDetails getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(EmploymentDetails empDetails) {
		this.empDetails = empDetails;
	}

	
	

}
