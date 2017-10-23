/**
 * 
 */
package com.sivakiran.eliminationtest.userinterface;

import java.util.Scanner;

/**
 * @author Bootcamp User 014
 *dispaly menu to user
 */
public class MainMenu {

	/**
	 * @param arg
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chos;boolean rFlag,lFlag;
		System.out.println("-------MENU-------	");
		System.out.println("choose: 1 - Customer Creation ");
		System.out.println("       2 - Sign in           ");
		System.out.println("       3 - Product Catolag   ");
		System.out.println("       4 - Shoping Cart      ");
		System.out.println("       5 - Payment Processing");
		System.out.println("       6 - Order Generation  ");
System.out.println("\nEnter your choice");
 chos= sc.nextInt();
 if(chos==1)
 {
	rFlag=RegistrationUi.saveCustomer() ;
	if(rFlag== true)
	{
		System.out.println("\nEnter 2 for login");
	    chos= sc.nextInt();
		lFlag=LoginUi.sendLogin();
		if(lFlag== true)
		{System.out.println("\nEnter 3 to Display Catalog");
	    chos= sc.nextInt();
	    lFlag=ProductUi.displayProducts();
	    if(lFlag== true)
		{System.out.println("\nEnter 4 to Display Catalog");
	    chos= sc.nextInt();
	    lFlag = CartUi.sendProductId();
	    if(lFlag== true)
	    {
	    	System.out.println("\nEnter 5 to Proceed for Payment");
		    chos= sc.nextInt();
		    lFlag =PaymentUi.sendCardDetails();
		    if(lFlag== true)
		    {
		    	System.out.println("\nEnter 6 for Order Generation");
			    chos= sc.nextInt();
			    OrderUi.sendcutomerId();
	    }
		}}
	}
 }

	}

}}
