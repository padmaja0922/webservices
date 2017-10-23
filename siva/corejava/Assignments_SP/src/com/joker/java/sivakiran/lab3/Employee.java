package com.joker.java.sivakiran.lab3;

public class Employee {

	int id;char gender;float allowance;double salary;
	Employee(int id)
	{
		this.id=id;
		
	}
	public static void main(String[] args) {
	
		Employee mply=new Employee(5);
		mply.gender='M';
		mply.salary=1200;
		mply.allowance=8.6f;
		System.out.println("id: "+mply.id+" \nGender :"+mply.gender+"\nsalary = "+	mply.salary+"\nalloweance = "+mply.allowance);

	}

}
