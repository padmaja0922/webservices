package com.bcj.corejava.data_types.array.lab3;

import java.util.Scanner;

public class FibonacciPrinter {

	public static void main(String[] args) {
		System.out.println("Enter the range:");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		printFibonacci(data); 
	}

	public static void printFibonacci(int data) {
		int[] ary = new int[data];
		int a = 0;
		int b = 1, i = 0;
		while (i < data) {
			int sum = a + b;
			ary[i] = sum;        //storing the value in ary
			a = b;
			b = sum;             //swapping the values 
			System.out.print(" " + ary[i]);
			i++;
		}

	}
}
