package com.bcj.corejava.flowcontrol.lab8;

import java.util.Scanner;

public class AsteriskSquare {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a square in between 2 and 20:");
		int side = sc.nextInt();
		for (int i = 1; i <= side; i++) {
	    System.out.print("\n");
		if (i == side || i == 1) {
		for (int j = 1; j <= side; j++)
		System.out.print(" *");}
			 else {
				for (int k = 1; k <= side; k++) {
			if (k == 1 || k == side)
			System.out.print(" *");
			else
			System.out.print("  ");
				}}}}}
