package com.sivakiran.eliminationtest.userinterface;

import java.util.Scanner;

import com.sivakiran.eliminationtest.controller.PaymentController;

public class PaymentUi {
	public String card;
	public String name;
	public String cvv;
	public int amount;
	public static boolean sendCardDetails()
	{
		Scanner sc = new Scanner(System.in);
		PaymentUi dtls=new PaymentUi();
		System.out.println("Enter Credit Card Number");
		dtls.card=sc.nextLine();
		System.out.println("Enter name on Credit Card ");
		dtls.name=sc.nextLine();
		System.out.println("Enter Cvv");
		dtls.cvv=sc.nextLine();
		System.out.println("Enter Amount");
		dtls.amount =sc.nextInt();
		boolean flag=PaymentController.sendCardDetails(dtls);
			System.out.println("Payment Approved");
		return true;
	}
}
