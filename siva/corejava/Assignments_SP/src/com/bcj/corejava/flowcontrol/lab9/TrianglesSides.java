package com.bcj.corejava.flowcontrol.lab9;

import java.util.Scanner;

public class TrianglesSides {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sides = new int[3];
		int temp = 0;
		for (int i = 0; i < 3; i++) {
			int n = i + 1;
			System.out.println("Enter side " + n + ":");
			sides[i] = sc.nextInt(); // taking input from user
			if (temp > sides[i]) {
				sides[i - 1] = sides[i];// swaping numbers assending order
				sides[i] = temp;

			}
			temp = sides[i];

		}
		if ((sides[2] * sides[2]) == (sides[0] * sides[0]) + (sides[1] * sides[1]))// checking
																					// for
																					// Phytogarus
																					// theorem
			System.out.println("Given sides form right angled triangle");
		else
			System.out.println("Given sides doesn't form right angled triangle");
	}

}
