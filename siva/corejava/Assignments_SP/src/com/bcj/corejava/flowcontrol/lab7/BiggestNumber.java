package com.bcj.corejava.flowcontrol.lab7;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		int largest=0;
		Scanner sc = new Scanner(System.in);
		for(int count=1;count<=10;count++)
		{
		System.out.println("Enter Number "+count);
		int number = sc.nextInt();
		if(number>largest)
			largest=number;
	}System.out.println("The biggest numbers is "+largest);

}}
