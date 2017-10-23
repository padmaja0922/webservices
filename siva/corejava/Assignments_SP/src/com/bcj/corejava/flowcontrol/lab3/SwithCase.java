package com.bcj.corejava.flowcontrol.lab3;

import java.util.Scanner;

public class SwithCase {

	        public static void main(String[] args) {
		    char grade='b';
		    Scanner sc = new Scanner(System.in);
			System.out.println("Grade Does't Exist \nEnter a grade between A and E :");
			 grade = sc.next().charAt(0);
			switch(grade)
			{
			case ('a'):
			case ('A'):System.out.println("your score is in between 80 to 100");break;
			case ('b'):
			case ('B'):System.out.println("your score is in between 73 to 79");break;
			case ('c'):
			case ('C'):System.out.println("your score is in between 65 to 72");break;
			case ('d'):
			case ('D'):System.out.println("your score is in between 55 to 64");break;
			case ('e'):
			case ('E'):System.out.println("your score is less than 55");break;
			default:
			System.out.println("Invalid Grade");
			}}}
