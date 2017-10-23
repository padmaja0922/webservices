package com.bcj.corejava.oops.overloading.lab2;

import java.sql.Date;

/**
 * @author Bootcamp User 014
 *program for constructor overloading 
 *by using constructor chaining technique 
 *with the help of this keyword
 */
public class Employee {
	
	String firstName,lastName;
	int employeeId; Date date;
public static void main(String args[])
{
	Employee e1=new Employee("siva");
	Employee e2=new Employee("ravi"," kiran");
	Employee e3=new Employee("siva","kiran",0025);
	e1.print();
	e2.print();
	e3.print();
	Date date=Date.valueOf("1991-04-02");//converting string into date type
	Employee e4=new Employee("siva","kiran",0025,date);
	e4.print();
}
Employee(String firstName){
	
	this.firstName=firstName;
}
Employee(String firstName,String lastName){
	this(firstName);
	this.lastName=lastName;
}
Employee(String firstName,String lastName,int  employeeId)
{  this(firstName,lastName);
	this.employeeId=employeeId;
}
Employee(String firstName,String lastName,int  employeeId,Date date)
{  this(firstName,lastName,employeeId);
this.date=date;
}
 public  void print()
 {
	System.out.println(firstName+" "+lastName+"\n Employee ID :"+employeeId+" Date:"+date); 
 }
 }