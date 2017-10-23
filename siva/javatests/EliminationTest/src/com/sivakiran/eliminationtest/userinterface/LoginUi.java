package com.sivakiran.eliminationtest.userinterface;

import java.util.Scanner;

import com.sivakiran.eliminationtest.controller.LoginController;

public class LoginUi {
	
	public String id;
	public String password;
	public static boolean sendLogin()
	{
		Scanner sc = new Scanner(System.in);
		LoginUi sign = new LoginUi();
		System.out.println("\nEnter your login id ");
		sign.id=sc.nextLine();
		System.out.println("Enter your password ");
      sign.password=sc.nextLine();
      LoginController.sendLogin(sign);
		return true;
	}
	public static void displayResult(boolean flag)
	{
		if(flag == true)
			System.out.println(" login Susseful");
		else
			System.out.println("login Failed");
	}

}
