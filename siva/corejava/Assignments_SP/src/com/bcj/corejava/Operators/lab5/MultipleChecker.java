package com.bcj.corejava.Operators.lab5;

import java.util.Scanner;

public class MultipleChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a multiple :");
		int multiple = sc.nextInt();
		System.out.println("Enter a factors :");
		int factor = sc.nextInt();
		if (multiple % factor == 0)
			System.out.println(multiple + " is  multiple of " + factor);
		else
			System.out.println(multiple + " is not a multiple of " + factor);
		sc.close();
	}
}



