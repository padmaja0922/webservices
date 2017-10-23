package com.bcj.corejava.data_types.strings.lab3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidationRegex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter email id ");
		String email = s.nextLine();
		if (email.length() > 3 && email.length() < 20)
		{
			if(true !=Pattern.matches("[a-zA-Z0-9_]*@[a-zA-Z0-9]*\\.{1}[a-zA-Z0-9]*\\.?[a-zA-Z]*", email))
			System.out.println("Invalid Position of Special Characters");
			else if(true !=Pattern.matches("[a-zA-Z_]+@[a-zA-Z0-9]+\\.{1}[a-zA-Z0-9]*\\.?[a-zA-Z]*", email))
			System.out.println("Invalid Combination for username");
			else if(true !=Pattern.matches("[A-Z]{1}[a-zA-Z0-9_]*@[a-zA-Z0-9]*\\.{1}[a-zA-Z0-9]*\\.{1}[a-zA-Z0-9]*", email))
				System.out.println("IVALID CASE OF 1ST LETTER");
			else 
				System.out.println("Entered email is valid");
			}
		else 
			System.out.println("Invalid lenght of email id");

	}

}
