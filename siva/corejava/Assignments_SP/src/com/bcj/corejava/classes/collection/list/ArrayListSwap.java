package com.bcj.corejava.classes.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 
 */

/**
 * @author siva
 *swapping the odd  position elements to even position elements
 */
public class ArrayListSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("how");
	list.add("are");
	list.add("you?");
	list.add("i");
	list.add("am");
	list.add("doing");
	list.add("fine");
	list=reverseOddAndEvenList(list);
	for(String str:list)
		System.out.println(str);
	}
public static ArrayList<String>  reverseOddAndEvenList(ArrayList<String> list) 
{
	for(int i=0;i<list.size()-1;i=i+2)
		Collections.swap(list,i,i+1);//swapping element positions
	
	return list;
	}
}
