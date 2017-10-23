package com.bcj.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bootcamp User 014
 *Take the customer details sort them in ascending and print
 */
public class DemoApplication {
//printing customer details in Ascending order
	public static void printByOrder(List<Customer> cstmr) {
		Iterator itr = cstmr.iterator();
		while (itr.hasNext()) {
			Customer cus = (Customer) itr.next();
			System.out.println(cus);
		}
	}

	public static void main(String[] args) {

		List<Customer> cstmr = new ArrayList<Customer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			Customer cust = new Customer();
			System.out.println("Enter first name");
			cust.setFirstName(sc.next());
			System.out.println("Enter Last name");
			cust.setLastName(sc.next());
			System.out.println("enter the age");
			cust.setAge(sc.nextInt());
			cstmr.add(cust);
		}

		System.out.println("\nSorting by First Name");
		Collections.sort(cstmr, new FirstNameComparator());
		printByOrder(cstmr);
		System.out.println("\nSorting by last Name");
		Collections.sort(cstmr, new LastNameComparator());
		printByOrder(cstmr);
		System.out.println("\nsorting by age...");
		Collections.sort(cstmr, new AgeComparator());
		printByOrder(cstmr);

	}
}
