package com.bcj.corejava.Operators.lab5;

import java.util.Scanner;

public class DigitsSeperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 digit number:");
		int data = sc.nextInt();
		int ary[] = new int[5],i=0;
		System.out.println("ary lenght is "+ary.length);
		while (i <ary.length ) {
			int quotient = data / 10;
			int reminder = data % 10; 
			data=quotient ;
	ary[i]=reminder;
	i++;
	}
		
for(int j=4;j>=0;j--)
	System.out.print(" "+ary[j]);
}}
