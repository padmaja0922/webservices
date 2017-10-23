package com.bcj.corejava.data_types.strings.lab5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IpValidation {

	public static void main(String[] args) {
		System.out.println("enter the ip address in the format");
		Scanner s= new Scanner(System.in);
	      String ipaddress=s.nextLine();
	      if(Pattern.matches("[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}",ipaddress))
	    		  System.out.println("valid ip adress");
	    	  
	      else
	    	  System.out.println("invalid ip adress");
		
	}

}
