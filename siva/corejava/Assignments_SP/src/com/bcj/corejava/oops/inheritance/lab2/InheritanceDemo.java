package com.bcj.corejava.oops.inheritance.lab2;

/**
 * @author Bootcamp User 014
 *This program is designed to understand the inheritance concept
 */
public class InheritanceDemo {

	public static void main(String[] args) {

		Car mycar = new Car();
		Truck mytruck = new Truck();
		System.out.println(mycar);
		mycar.m1();
		mycar.m2();
		System.out.println(mytruck);
		mytruck.m1();
		mytruck.m2();

	}

}

class Car {
	public void m1() {
		System.out.println("car 1");
	}

	public void m2() {
		System.out.println("car 2");
	}

	public String toString() {
		return "vroom";
	}
}

class Truck extends Car {
	public void m1() {
		System.out.println("truck 1");
	}
}
