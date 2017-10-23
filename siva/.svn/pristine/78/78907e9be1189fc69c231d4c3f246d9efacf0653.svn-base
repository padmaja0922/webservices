package com.sivakiran.eliminationtest.userinterface;

import java.util.Scanner;

import com.sivakiran.eliminationtest.controller.RegistrationController;
import com.sivakiran.eliminationtest.database.RegistartionDb;
import com.sivakiran.eliminationtest.entity.Customer;
import com.sivakiran.eliminationtest.service.RegistrationService;


public class RegistrationUi {

	public String name;
	public String lastName;
	public String phoneNumber;
	public String email;
	public String userId;
	public String Password;
	public static boolean saveCustomer()
	{ 
		Scanner sc = new Scanner(System.in);
		RegistrationUi reg=new RegistrationUi();
		System.out.println("Enter your Name ");
		reg.name=sc.nextLine();
		System.out.println("Enter your last Name ");
		reg.lastName=sc.nextLine();
		System.out.println("Enter your phone number ");
		reg.phoneNumber=sc.nextLine();
		System.out.println("Enter your Email ");
		reg.email=sc.nextLine();
		System.out.println("Enter your userid");
		reg.userId=sc.nextLine();
		System.out.println("Enter your password");
		reg.Password=sc.nextLine();
		RegistrationController.saveCustomer(reg);
		return true;
		
		}
	public static void DisplayCustomer(RegistartionDb db)
	{
		System.out.println("\nRegistartion Sucessfull");
		System.out.println("\nEntered name           :"+db.getName());
		System.out.println("Enterd last name       :"+db.getLastName());
		System.out.println("Entered Phone number   :"+db.getPhoneNumber());
		System.out.println("Enterd Email           :"+db.getEmail());
		System.out.println("your user id           :"+db.getUserId());
		System.out.println("your password          :"+db.getPassword());
	}
	
	
	
}
