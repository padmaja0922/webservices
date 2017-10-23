package com.bcj.corejava.data_types.strings.lab5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		System.out.println("enter the email id ");
		Scanner s= new Scanner(System.in);
	      String email=s.nextLine();
	      if(Pattern.matches("[a-zA-Z]+@[a-zA-Z]+\\.com", email))
	      System.out.println("valid Email");
	      else
	    	  System.out.println("invalid Eamil");
	     

	}

}
