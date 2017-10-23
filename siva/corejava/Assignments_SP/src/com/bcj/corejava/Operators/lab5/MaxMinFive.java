package com.bcj.corejava.Operators.lab5;

import java.util.Scanner;

public class MaxMinFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary=new int[5];
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < 5; i++)
	ary[i] = sc.nextInt();//storing array
		int min=ary[0],max=ary[0];
		for (int i = 1; i < 5; i++)
		{
			if (max < ary[i])
				max = ary[i];      //comparing biggest
			else if (min>ary[i])
				min=ary[i];         //comparing smallest
		}
			System.out.println("The max and min numbers are " + max + "," + min);
		
	}}
		


