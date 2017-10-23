package com.sivakiran.eliminationtest.controller;

import com.sivakiran.eliminationtest.service.LoginService;
import com.sivakiran.eliminationtest.userinterface.LoginUi;

public class LoginController {

	public static void sendLogin(LoginUi sign)
	{
		boolean flag = LoginService.verifyLogin(sign);
		
			LoginUi.displayResult(flag);
		
}
	
}
