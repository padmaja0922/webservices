package com.bcj.corejava.Operators.lab5;

import java.util.Scanner;

public class BasicArithmetic {
//Basic calculation
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X and Y :");
		int x= sc.nextInt();
		int y= sc.nextInt();
System.out.println("sum is :"+(x+y));
System.out.println("Difference  is :"+(x-y));
System.out.println("product is :"+(x*y));
System.out.println("quotient is :"+(x/y));
	}

}
