package com.bcj.corejava.Operators.lab5;

import java.util.Scanner;
//Finding Diameter,circumfrence and area of Circle by using Math class methods

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of the circle");
		int radius = sc.nextInt();         
		System.out.printf("Diameter = %d" ,(2 * radius));
		System.out.printf(" \nCircumfrence %.2f",(2*radius*Math.PI));
		System.out.printf(" \nArea %.2f",(Math.pow(radius, 2)*Math.PI));
	}

}
