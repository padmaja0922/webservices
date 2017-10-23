package com.bcj.corejava.flowcontrol.lab5;

import java.util.Scanner;

public class CommissionCaluculator {

	public static void main(String[] args) {
		double[]item={239.99,129.75,99.95,350.89} ;
		double salary,counter=0,holder=0; int itemsold;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter sold quantity for item no "+(i+1));
		     itemsold = sc.nextInt();
		     holder=item[i]*itemsold;
		     counter=counter+holder;
	}
double comission =counter*0.09;
   salary=comission+200;
System.out.println("Net pay for the salesperson is :"+salary);
	}

}
