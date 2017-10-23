package com.bcj.corejava.classes.collection.list;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author siva this call modifies ArrayList of Strings and replaces every
 *         string with two of that string.
 * 
 */
public class DoubleList {

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();

		list.add("how");
		list.add("are");
		list.add("you");
		ArrayList<String> al = copyContent(list);
		for (String elmnt : al) {
			System.out.println(elmnt);
		}
	}

	public static ArrayList<String> copyContent(ArrayList<String> list) {
		ArrayList<String> totalList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			totalList.add(list.get(i));
			totalList.add(list.get(i));

		}
		return totalList;

	}
}
