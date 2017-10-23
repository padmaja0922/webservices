package com.sivakiran.eliminationtest.database;

import com.sivakiran.eliminationtest.entity.Customer;

public class RegistartionDb {
	
	
	public String name;
	public String lastName;
	public String phoneNumber;
	public String email;
	public String userId;
	public String Password;
	
	public static RegistartionDb saveCustomer(Customer cust)
	{
		 RegistartionDb db = new RegistartionDb();
		db.name=cust.getName();
		db.lastName=cust.getLastName();
		db.phoneNumber=cust.getPhoneNumber();
		db.email=cust.getEmail();
		db.userId=cust.getUserId();
		db.Password=cust.getPassword();
		
		 return db;
}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return Password;
	}
	

}
