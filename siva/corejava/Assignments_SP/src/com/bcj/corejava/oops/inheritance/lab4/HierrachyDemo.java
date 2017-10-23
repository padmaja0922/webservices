package com.bcj.corejava.oops.inheritance.lab4;

/**
 * @author Bootcamp User 014
 *implemanting Hierrachy concept in inheritance
 *using super to call immediate super class
 */
public class HierrachyDemo {

	public static void main(String[] args) {
		Senior sr =new Senior();
		Freshman fr = new Freshman();
fr.print();
	}

}

class Student {
	String fName,studentType;
	int id;

	public Student(int id){
		this.id = id;
	}
	 Student(){
		 
	 }
	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	{this.setfName("siva kiran");
	this.setId(11);}
	
	public void print(){
		System.out.println("i am a student");
		
	}
}

class UndergradStudent extends Student {

	public void print() {
		super.print();//call print method in student class
		super.setStudentType("undergrad");
		System.out.println("my name is "+super.getfName()+" ,ID: "+super.getId()+" \ndoing "+super.getStudentType());
	}
}

class Freshman extends UndergradStudent {
	public void print() {
		super.print();//call print method in undergrad class
		System.out.println("i am Freshman");
	}
}

class Senior extends UndergradStudent {

	public void print() {
		System.out.println("i am in senior level");
	}
}

class GraduateStudent extends Student {
	public void print() {
		super.setStudentType("Graduate");
		System.out.println("i am "+super.getfName()+" ID: "+super.getId()+" \ndoing "+super.getStudentType());
	}

}

class DoctoralStudent extends GraduateStudent {
	
		public void print() {
			System.out.println("i am doing P.hd");
		}
	
	

}

class MasterStudent extends GraduateStudent {
	public void print() {
		System.out.println("i am doing masters");
	}
}
