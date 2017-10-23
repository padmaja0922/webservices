/**
 * 
 */
package com.bcj.crud.ui;

import java.util.Scanner;

import com.bcj.crud.controller.ModificationController;

/**
 * @author Bootcamp User 014
 *update the already exiting user details by using customer id
 */
public class ModificationUi {
	public static void modifyCustomer(int mode) {
		System.out.println("Update your details here");
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your Customer id ");
		int id=scnr.nextInt();
		System.out.println("Enter first name ");
		String fName=scnr.next();
		
		System.out.println("Enter last name ");
		String lName=scnr.next();
		
		System.out.println("Enter Email id ");
		String email=scnr.next();
		
		System.out.println("Enter phone nmbr ");
		String nmbr=scnr.next();
		boolean flag=ModificationController.modifyCustomer(fName,lName,email,nmbr,id,mode);
		if(flag == true)
			System.out.println("update sucessfully");
		else
			System.out.println("update failed");

}}
