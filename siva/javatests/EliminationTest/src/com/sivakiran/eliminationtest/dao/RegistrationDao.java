package com.sivakiran.eliminationtest.dao;

import com.sivakiran.eliminationtest.database.RegistartionDb;
import com.sivakiran.eliminationtest.entity.Customer;

public class RegistrationDao {
	public static RegistartionDb saveCustomer(Customer cust)
	{
	
		RegistartionDb db= RegistartionDb.saveCustomer(cust);
	
return db;
	
		
	}
	
}
