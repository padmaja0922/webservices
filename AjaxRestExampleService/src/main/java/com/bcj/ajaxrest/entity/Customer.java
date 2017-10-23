package com.bcj.ajaxrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


  @NamedNativeQueries({
	  
	  @NamedNativeQuery(
			  
			name = "getCustomerProcedure",
			query = "CALL getCustomer(:id) ",
			resultClass = Customer.class
			  
		)	  
	
  })


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Customer {
	
	@GeneratedValue
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fisrtName) {
		this.firstName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fisrtName=" + firstName + ", lastname=" + lastName + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
	

}
