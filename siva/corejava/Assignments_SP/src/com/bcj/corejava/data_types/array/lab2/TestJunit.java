/**
 * 
 */
package com.bcj.corejava.data_types.array.lab2;

/**
 * @author Bootcamp User 014
 *testing the logics by using Junit test casses
 */
public class TestJunit {
	public static void main(String[] args) {
		int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int x=findBig(numbersArray);
System.out.println(x);
}
	public static int findBig(int[] a)
	{
		int  bigNmbr=0;
	
		for (int i = 0; i < a.length; i++) {
			if (a[i] > bigNmbr)// finding highest vaiue in array
				bigNmbr = a[i];
		
	}return bigNmbr;
		}
}