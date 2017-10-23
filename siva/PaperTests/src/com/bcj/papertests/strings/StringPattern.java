package com.bcj.papertests.strings;

import java.util.Scanner;

public class StringPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		printStringPattern(str);

	}

	public static void printStringPattern(String str) {
		// TODO Auto-generated method stub
		int lnth=str.length();
		int x= lnth-2;
		
		System.out.println(str+" => "+str.charAt(0)+x+str.charAt(lnth-1));
	}


}
