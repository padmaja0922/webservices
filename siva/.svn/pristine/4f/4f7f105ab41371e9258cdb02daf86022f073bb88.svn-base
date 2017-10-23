package com.bcj.corejava.oops.interfaces.lab2;

public class InterfaceDemo implements CharSequence  {
	String data="abcde";
	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		System.out.println("the character at 2 :" + id.charAt(1));
		System.out.println("length  is :" + id.length());
		System.out.println("The subsequence form 0-3 is: " + id.subSequence(0, 2));

		System.out.println("reverse of the given string is :");
		String temp = "";
		for (int i = id.length() - 1; i >= 0; i--) {
			temp = temp + id.charAt(i);
		}
		System.out.println(temp);	
	
}
	public char charAt(int arg0) {

		return data.charAt(arg0);
	}

	public int length() {

		return data.length();
	}

	public CharSequence subSequence(int arg0, int arg1) {

		return data.subSequence(arg0, arg1);
	}
}