package com.bcj.corejava.Operators.lab5;

import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers :");
		int x= sc.nextInt();
		int y= sc.nextInt();
		if(x>y)
			System.out.println("The largest number is :"+x);
		else if(x==y)
			System.out.println("Both numbers are equal");
		else
			System.out.println("The largest number is :"+y);
	}

}
