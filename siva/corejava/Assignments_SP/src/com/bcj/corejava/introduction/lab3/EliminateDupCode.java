package com.bcj.corejava.introduction.lab3;

public class EliminateDupCode {

	public static void main(String[] args)
	{
		printMethod();
	}
public static void printMethod()
{
	for(int i=1;i<7;i++)
	{
		System.out.println("Go, team, go!\nYou can do it.");
		if(i==2||i==4)
			System.out.println("You're the best,\nIn the West.");
		else
			System.out.println();
		
	}
	}
}
