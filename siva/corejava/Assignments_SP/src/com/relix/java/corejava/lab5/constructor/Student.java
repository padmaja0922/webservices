package com.relix.java.corejava.lab5.constructor;

public class Student {
	private int studentId ;
	private char studentType;
	

	public Student() {
		
		studentId=10;
		studentType='F';
	}


	public int getStudentId() {
		return studentId;
	}


	


	public char getStudentType() {
		return studentType;
	}


	
public static void main(String[] args) {
	Student s =new Student();
	
	System.out.println(s.getStudentId());
	System.out.println(s.getStudentType());
}

}
