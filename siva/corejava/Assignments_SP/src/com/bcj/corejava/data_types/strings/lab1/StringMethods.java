package com.bcj.corejava.data_types.strings.lab1;

public class StringMethods {

	public static void main(String[] args) {
		String base = "hello how are you?";
		int count = 1;
		// counting no.of words

		for (int i = 0; i < base.length()-1; i++) {
			if ((base.charAt(i) != ' ') && (base.charAt(i + 1) == ' '))

				count++;

		}
		System.out.println("no .of words are " + count);
		System.out.println("lenght of string is :"+base.length());//finding length
		System.out.println("Replaced String is :"+base.replace("hello", "HELLO"));//replacing string
		System.out.println("after replacing space with comma :"+base.replace(' ', ','));
		System.out.println("1st 3 charectors are :"+base.substring(0,3));//creating substring
		
		String str="Hello";String str1="HELLO";
		if(str.equals(str1))//comparing string
			System.out.println("strings are equal");
		else
			System.out.println("Strings are not equal");
		String plndrm="NITIN",copy="";//checking for palindrom
		for(int i=0;i<plndrm.length();i++)
		{
			copy=copy+plndrm.charAt(i);
			}if(plndrm.compareTo(copy)==0)
		System.out.println("Given string is palindrome");
			else 
				System.out.println("given String is not palindrome");
	
	String ocr="HELLO HOW ARE YOU AND WHERE ARE YOU";char a='A';
	int charCount=0;//finding the occurance
	for(int j=0;j<ocr.length();j++)
	{
		if(ocr.charAt(j)==a)
			charCount++;
		
	}System.out.println("No.of occurance of A is "+charCount);
	
	String repls="This  is a java institute of insurance and insu.";
	if(repls.contains("institute"))//repalcing the charectors
	System.out.println("replaced String is : "+repls.replace("institute", "jsstitute"));
	
}}
