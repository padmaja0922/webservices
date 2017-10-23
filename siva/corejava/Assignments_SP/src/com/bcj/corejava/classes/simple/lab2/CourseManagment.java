package com.bcj.corejava.classes.simple.lab2;

public class CourseManagment {

	public static void main(String[] args) {
		
		 Student student=new Student();
		Student s1=new Student();
		student.setStudentType('F');
		student.setId(2);
		System.out.println(" id :"+student.getId()+" catagery : "+student.getStudentType());

	}

}
