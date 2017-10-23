/**
 * 
 */
package com.bcj.crud.ui;

import java.util.Scanner;

import com.bcj.crud.controller.RegfinementController;

/**
 * @author Bootcamp User 014
 *delete the customer details by using customer id
 */
public class RefinementUi {
	public static void deleteCustomer(int mode)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id to delete");
		int id=sc.nextInt();
		boolean flag=RegfinementController.deleteCustomer(id,mode);
		if(flag = true)
			System.out.println("your details sucessfully deleted");
		else
			System.out.println("delete failed!");
	}

}
