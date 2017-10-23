package com.sivakiran.eliminationtest.userinterface;

import java.util.Scanner;

import com.sivakiran.eliminationtest.controller.OrderController;

public class OrderUi {
	
	public static void sendcutomerId()
	{Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID");
		String id=sc.nextLine();
System.out.println("your Order Id :"+OrderController.sendcutomerId(id));
}
}