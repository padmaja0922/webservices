package com.bcj.corejava.data_types.strings.lab2;

public class StringSpliter {
//spliting string by "/"
	public static void main(String[] args) {
		String dob="04/02/1992";
		String[] words=dob.split("/");
for(String i:words)
	System.out.println(i);
	}

}
