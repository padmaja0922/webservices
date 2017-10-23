package com.sivakiran.eliminationtest.dao;

import com.sivakiran.eliminationtest.database.LoginDb;
import com.sivakiran.eliminationtest.database.RegistartionDb;
import com.sivakiran.eliminationtest.entity.Customer;

public class LoginDao {

	public static LoginDb  retriveLogin()
	{
		LoginDb ldb=LoginDb.retriveLogin();
		return ldb;
	}
}
