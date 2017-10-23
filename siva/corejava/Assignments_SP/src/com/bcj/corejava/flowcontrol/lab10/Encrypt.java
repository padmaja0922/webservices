package com.bcj.corejava.flowcontrol.lab10;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		System.out.println("Enter 4 digit number:");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();                    // taking input from user
		int reminder = 0, quotient = 0, newQuotient = 0, dividend = data,
			temp=0,	i = 0, newReminder = 0, ary[] = new int[4];
		System.out.print("After adding 7, reminders are:");
		while (i <= 3) {
			quotient = dividend / 10;
			reminder = dividend % 10;                //separating digits from number
			newQuotient = reminder + 7;              //adding 7 to a digit
			newReminder = newQuotient % 10;              //getting reminder of new digit
			dividend = quotient;
			ary[i] = newReminder;

			
			System.out.print( " "+ newQuotient);
			i++;
		}
  temp=ary[1];
  ary[1]=ary[3];                                    //swapping digits
  ary[3]=temp;
  temp=ary[0];
  ary[0]=ary[2];                                    //swapping digits
  ary[2]=temp;
  
  System.out.println("\nYour Encrypted data is ");
  for(int j:ary)
		System.out.print(j);
	new Decrypt().decriptor(ary);	

}}
class Decrypt                                      //application for decryption
{
public void decriptor(int[] newAry)	
{
	int temp=0,Quotient;
	 temp=newAry[3];
	  newAry[3]=newAry[1];                                    //reswapping digits
	  newAry[1]=temp;
	  temp=newAry[2];
	  newAry[2]=newAry[0];                                    //reswapping digits
	  newAry[0]=temp;
	 
	  System.out.println("\nDecrypted data is:");
	  for(int j=3;j>=0;j--)
	  {
		  if(newAry[j]<=6)                                      // retriving  the  orginal data
			  newAry[j]=newAry[j]+10;
		  newAry[j]=newAry[j]-7;
		  System.out.print(newAry[j]);
	  }
	 
}}
