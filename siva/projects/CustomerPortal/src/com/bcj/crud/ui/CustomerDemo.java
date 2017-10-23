/**
 * 
 */
package com.bcj.crud.ui;

import java.util.Scanner;

/**
 * @author Bootcamp User 014
 *display options for mode of connection
 *options to choose particular crud operation
 */
public class CustomerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		while (true) {
			System.out.println("\nselect 1 to use method \nselect 2 to use properties file ");
			int mode = scnr.nextInt();
			while (mode < 1 || mode > 2) {
				System.out.println("please choose 1st or 2nd  mode of Connection");
				mode = scnr.nextInt();
			}
			System.out.println("choose options below to continue");
			System.out.println("__________________________________");
			System.out.println(" Enter 1 to Registration");
			System.out.println(" Enter 2 to Update your details ");
			System.out.println(" Enter 3 to delete ");
			int chos = scnr.nextInt();

			if (chos == 1)
				RegistrationUi.saveCustomer(mode);
			else if (chos == 2)
				ModificationUi.modifyCustomer(mode);
			else if (chos == 3)
				RefinementUi.deleteCustomer(mode);
			else

				System.out.println("Invalid Entry");

		}
	}
}
