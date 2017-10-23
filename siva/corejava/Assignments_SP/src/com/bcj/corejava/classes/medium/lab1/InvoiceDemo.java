package com.bcj.corejava.classes.medium.lab1;

import java.util.Scanner;

public class InvoiceDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Invoice in=new Invoice();
		System.out.println("enter the quantity of items ");
		int quantity=s.nextInt();
		if(quantity<0)
			in.setQuantity(0);
		else in.setQuantity(quantity);
		System.out.println("enter the price of the each item");
		double price=s.nextDouble();
		s.close();
		if(price>0)
			in.setPricePerItem(price);
		else in.setPricePerItem(0.0);
		in.setItemDescription("Anti virus software ");
		in .setPartNumber("8512");
		double amount=in.getQuantity()*in.getPricePerItem();
		System.out.println("the part no of item is :"+in.getPartNumber());
		System.out.println("description of item is :"+in.getItemDescription());
		System.out.println("the no of items is "+in.getQuantity());		
		System.out.println("the total amount is: "+amount );
		

	}

}
