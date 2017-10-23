package com.bcj.corejava.Operators.lab4;

import java.util.Scanner;

public class Temp_Converter {
public void  convertingFahrenheit(int ctemp)
{
	float ftemp=(ctemp*1.8f)+32;
	System.out.println("Temperature in Fahrenheit is :"+ftemp+"F");
	
}
public void  convertingCelsius(int ftemp)
{
	float ctemp=(ftemp-32)/1.8f;
	System.out.println("Temperature in Celsius is :"+ctemp+"C");
	
}
	public static void main(String[] args) {
		int temp;
		Temp_Converter tc=new Temp_Converter();
		Scanner sc = new Scanner(System.in);
		System.out.println("To convert temp from Fahrenheit to Celsius press 'F' \nTo Convert temperature from Celsius to Fahrenheit 'C'");
	char ky=sc.next().charAt(0);
	if(ky=='c'){
		System.out.println("Enter temperture in Celsius ");
	 temp=sc.nextInt();
		tc.convertingFahrenheit(temp);
	}
	else if(ky=='f')
	{
		System.out.println("Enter temperture in  Fahrenheit");
		 temp=sc.nextInt();
			tc.convertingCelsius(temp);
	}
	else
		System.out.println("Invalid Entry");
}
}