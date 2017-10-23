package com.bcj.corejava.data_types.array.lab1;

public class high_low_Avg {
	public static void main(String[] args) {
		int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int sum = 0, bigNmbr = 0, avg;
		System.out.println("odd numbers are ");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] % 2 != 0)
				System.out.print(" " + numbersArray[i]);// Printing odd numbers
														// in a
														// Array
			else
				numbersArray[i] = numbersArray[i] + 2;
		}
		System.out.println("\nnew array is");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] > bigNmbr)// finding highest vaiue in array
				bigNmbr = numbersArray[i];
			sum = sum + numbersArray[i];// adding all array elements
			System.out.print(" " + numbersArray[i]);// Printing new Array
		}
		avg = sum / numbersArray.length;// finding average
		int smallNmbr = avg;
		System.out.println("\nnumbers divisiable by 3 are ");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < smallNmbr) 
				smallNmbr = numbersArray[i];
			if (numbersArray[i] % 3 == 0)
				System.out.print(" "+ numbersArray[i]);// Printing numbers
														// divisable by 3
		}
		System.out.println("\nsum of the elements in the array is :" + sum);

		System.out.println("Average of th array is :" + avg);// printing the
																// average of an
																// array
		System.out.println("Highest value in array is :" + bigNmbr);// printing
																	// big
																	// number
		System.out.println("smallest value in array is :" + smallNmbr);// printing
																		// small
																		// number
		System.out.println("numbers less than average are ");
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < avg)
				System.out.print(" " + numbersArray[i]);
		}
	}

}
