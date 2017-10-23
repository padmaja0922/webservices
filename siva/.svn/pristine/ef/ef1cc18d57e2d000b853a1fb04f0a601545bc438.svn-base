package com.bcj.corejava.collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class BackwardOrdering implements Comparator<Integer>
{

	

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
      return 1;
		else
		return -1;
		
	}}

class AlternatingOrdering implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1>0 && o2>0){
			if(o1<o2)
			      return -1;
					else
					return 1;
		}else{if(o1<o2)
			return 1;
			else
			return -1;
		}
			
		      
		
	}}

/**
 * @author siva
 *this class is using to sort arraylist by using collection.sort method and comparator interface
 */
public class CollectionSort {

	 public static void main(String[] args) {
		    int listSize = 30;
		    int magnitude = 500;
		    Random rand = new Random(12345);
		    
			ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
		    for (int i=0; i < listSize; i++) {
		      numbers.add(rand.nextInt() % magnitude);
			}
		    Collections.sort(numbers);//sorting in ascending order
		    
		    System.out.println("			printing in Ascending order");
			for (Integer num : numbers) {
		      System.out.print(num + " ");
			}
		    System.out.println("\n			printing in descending order");
		    Collections.sort(numbers, new BackwardOrdering());//sorting in descending  order
		    
			for (Integer num : numbers) {
		      System.out.print(num + " ");
			}
			
			 System.out.println("\n			printing in Altering order");// sorting in altering order
			Collections.sort(numbers, new AlternatingOrdering());
			for (Integer num : numbers) {
			      System.out.print(num + " ");
				}
		  }
}

