package com.bcj.corejava.classes.simple.lab4;

public class DemoStudent {

	public static void main(String[] args) {
 Student student=new Student();
		
		student.setStudentId(1001);
		student.setQualifyingExamMarks(95.0f);
		student.setResidentialStatus('D');
		student.setYearOfEngg(2);
		System.out.println("studentid : "+student.getStudentId());
		System.out.println("qualifying Exam Marks :"+student.getQualifyingExamMarks());
		System.out.println("residential status : "+student.getResidentialStatus());
		System.out.println("current year of engg "+student.getYearOfEngg());
		
	}

}
