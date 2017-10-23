package com.bcj.corejava.classes.medium.lab2;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		// creating an object of employee
		Employee e1 = new Employee();

		System.out.println("enter your name ");
		String fName = s.nextLine();
		e1.setFirstName(fName);

		System.out.println("enter your last name ");
		String lName = s.nextLine();
		e1.setLastName(lName);

		System.out.println("enter your salary");
		double salary = s.nextDouble();
		if (salary < 0)
			e1.setSalary(0);
		else
			e1.setSalary(salary);

		Employee e2 = new Employee();

		System.out.println("enter your name ");
		String fName2 = s.next();
		e2.setFirstName(fName2);

		System.out.println("enter your last name ");
		String lName2 = s.next();
		e2.setLastName(lName2);

		System.out.println("enter your salary");
		double salary2 = s.nextDouble();
		if (salary2 < 0)
			e2.setSalary(0);
		else
			e2.setSalary(salary2);
		s.close();
		System.out.println("salary before increment of 10%");
		System.out.println();
		System.out.println("salary of employee1 is :" + e1.getSalary());
		System.out.println("salary of employee2 is :" + e2.getSalary());
		System.out.println();

		e1.setSalary(e1.getSalary() * 0.1 + e1.getSalary());
		e2.setSalary(e2.getSalary() * 0.1 + e2.getSalary());

		System.out.println("salary after  increment of 10%");

		System.out.println();
		System.out.println("salary of employee1 is :" + e1.getSalary());
		System.out.println("salary of employee2 is :" + e2.getSalary());
	}

}
