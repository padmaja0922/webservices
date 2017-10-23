package com.bcj.collections.sort;

public class Student implements Comparable<Student>{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;
	System.out.println(age+" ");
	}  
	  
	public int compareTo(Student st){  
		System.out.println(age+" "+st.age);
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
	}  
	}  


