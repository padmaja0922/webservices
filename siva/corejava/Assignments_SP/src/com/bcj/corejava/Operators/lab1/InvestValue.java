package com.bcj.corejava.Operators.lab1;

public class InvestValue {
	public static void main(String args[])
	{
int amount=14000;
System.out.println("your investment is $"+amount);
double year1=(amount*(0.4))+amount;
double year2=year1-1500;
double year3=(year2*.12)+year2;
System.out.println("amount at the end of 3rd year is $"+year3);
double net=year3-amount;
System.out.println("The worth of this investment is $"+net);
}}
