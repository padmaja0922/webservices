package com.bcj.corejava.introduction.lab4;

public class DemoRefactorMethodBefore {

	public static void main(String[] args)

	{
String name="kiran", city="Dallas",state="Tx";
adressPrinter(name,city,state);
int i = 5, j = 6;
add(i,j);
		}
	public static void adressPrinter(String name,String city,String state)
	{
		for(int i=1;i<4;i++)
		{
		 System.out.println("Hello, My name is "+name);
		    System.out.println("I live in "+city+","+state);
		    System.out.println("I am a java instructor");
		    System.out.println("I work for Nivtek\n");
		}}
		public static void add(int i,int j)
		{
		    int k = i + j;
		   
		    System.out.println(k);
		    k = 4 + 7;
		    System.out.println(k);	
		}

}
