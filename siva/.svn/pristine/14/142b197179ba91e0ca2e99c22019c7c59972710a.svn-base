/**
 * 
 */
package com.bcj.crud.ui;

import java.util.Scanner;

import com.bcj.crud.controller.RegistrationController;

/**
 * @author Bootcamp User 014
 *This classes we are getting user details from user
 */
public class RegistrationUi {

	
	
	public static void saveCustomer(int mode) {
		
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter first name ");
	String fName=scnr.nextLine();
	
	System.out.println("Enter last name ");
	String lName=scnr.nextLine();
	
	System.out.println("Enter Email id ");
	String email=scnr.nextLine();
	
	System.out.println("Enter phone nmbr ");
	String nmbr=scnr.nextLine();
	int id=RegistrationController.saveCustomer(fName,lName,email,nmbr,mode);
	 System.out.println("sucessfully Registerd \nyour  customer id is : "+id);
	
     
		
	}

}
