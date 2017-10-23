package com.sivakiran.eliminationtest.service;

import com.sivakiran.eliminationtest.dao.LoginDao;
import com.sivakiran.eliminationtest.database.LoginDb;
import com.sivakiran.eliminationtest.userinterface.LoginUi;

public class LoginService {
	
	public static boolean verifyLogin(LoginUi sign)
	{
		LoginDb lds =LoginDao.retriveLogin();
		if(sign.id.equals(lds.getId()) && sign.password.equals(lds.getCode()));
			return true;
		
			
	}

}
