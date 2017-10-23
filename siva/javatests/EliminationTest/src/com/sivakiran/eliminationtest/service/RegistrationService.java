package com.sivakiran.eliminationtest.service;
import java.util.Random;

import com.sivakiran.eliminationtest.dao.RegistrationDao;
import com.sivakiran.eliminationtest.database.RegistartionDb;
import com.sivakiran.eliminationtest.entity.Customer;

public class RegistrationService {
	
	
	
public static RegistartionDb saveCustomer(Customer cust)
{
	RegistartionDb db=RegistrationDao.saveCustomer(cust);
return db;
	}
}
