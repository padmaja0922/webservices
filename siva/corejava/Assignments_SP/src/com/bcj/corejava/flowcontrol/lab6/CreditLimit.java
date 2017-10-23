package com.bcj.corejava.flowcontrol.lab6;

import java.util.Scanner;

public class CreditLimit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter customer account number");
			int acont = sc.nextInt();
			System.out.println("Enter total of all items charged by this month");
			int chrg = sc.nextInt();
			System.out.println("Enter balance at begnning of the month");
			int blns = sc.nextInt();
			System.out.println(" Enter all credits applied to the customer’s account");
			int credit = sc.nextInt();
			System.out.println(" Enter credit limit for the customer’s account");
			int limit = sc.nextInt();
			int  newBalance = blns + chrg-credit; 
			System.out.println("New balance is "+newBalance);
			if(newBalance<limit)
				System.out.println("Credit limit exceeded");
	}

}
