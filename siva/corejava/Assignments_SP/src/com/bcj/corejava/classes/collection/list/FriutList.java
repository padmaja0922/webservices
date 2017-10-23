package com.bcj.corejava.classes.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 
 */

/**
 * @author siva
 *this program is using anArraylist to add list of fruits
 */
public class FriutList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("pear");
		fruits.add("banana");
		fruits.add("tangerine");
		fruits.add("strawberry");
		fruits.add("blackberry");
	ListIterator<String> itr = fruits.listIterator();
	System.out.println("printing list in entry order");
	while(itr.hasNext())//printing list in entry order
		System.out.println(itr.next());
	
	System.out.println("printing list in reverse order");
	
	while(itr.hasPrevious())//printing list in reverse order
	System.out.println(itr.previous());
	
	System.out.println("after adding the elements");
    fruits.add(3,"banana");	
    ListIterator<String> itr1 = fruits.listIterator();
    while(itr1.hasNext())
		System.out.println(itr1.next());
}}
