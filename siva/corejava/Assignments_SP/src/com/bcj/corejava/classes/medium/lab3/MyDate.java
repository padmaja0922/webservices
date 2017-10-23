package com.bcj.corejava.classes.medium.lab3;

public class MyDate {
	private int day;
	private int month;
	private int year;
	MyDate( int month,int day,int year)
	{
	this.day=day;
	this.month=month;
	this.year=year;
	}
	public void dispalyData()
	{
		System.out.println(" current date is :"+this.getMonth()+"/"+this.getDay()+"/"+this.getYear());
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


}
