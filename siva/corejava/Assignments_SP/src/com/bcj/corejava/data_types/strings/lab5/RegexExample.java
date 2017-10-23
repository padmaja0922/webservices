package com.bcj.corejava.data_types.strings.lab5;
import java.util.Scanner;
import java.util.regex.*;
public class RegexExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number : ");
		String nmbr=sc.nextLine();
		System.out.println("Entered phone number is valid:"+Pattern.matches("[0-9]{3}[\\.\\s\\-]{1}[\\d]{3}[\\.\\s\\-]{1}[\\d]{4}",nmbr));

	}

}
