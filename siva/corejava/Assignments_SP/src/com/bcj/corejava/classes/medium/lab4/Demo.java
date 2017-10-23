/**
 * 
 */
package com.bcj.corejava.classes.medium.lab4;

import java.util.Scanner;

/**
 * @author Bootcamp User 014
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std= new Student();
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name ");
		std.setName(s.nextLine());
		//String fName = s.nextLine();
		std.validateStudentName();
		System.out.println("enter your branch ");
		String branch =s.nextLine();
		boolean flag=std.validatebranchName(branch);
		if(flag==true)
			System.out.println("your data is recorded");
		else
			System.out.println("Invalid Branch Name, set to CSE");
	}

}
