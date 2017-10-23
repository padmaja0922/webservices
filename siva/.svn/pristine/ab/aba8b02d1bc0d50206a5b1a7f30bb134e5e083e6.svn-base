package com.bcj.corejava.classes.collection.list;

import java.util.ArrayList;

/**
 * 
 */

/**
 * @author siva this class take a string element from list reverse that and put
 *         in same index
 */
public class ListElementRevers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("how");

		list.add("are");
		list.add("you?");

		list = reverseList(list);
		for (String str : list)
			System.out.println(str);
	}

	public static ArrayList<String> reverseList(ArrayList<String> list) {

		String hold;

		for (int i = 0; i < list.size(); i++) {
			hold = list.get(i);
			String reverse = "";
			
			for (int j = hold.length() - 1; j >= 0; j--)
				reverse = reverse + hold.charAt(j);//reversing the element

			list.set(i, reverse);//setting the reversed string at same index 

		}
		return list;
	}
}
