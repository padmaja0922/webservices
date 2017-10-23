package com.bcj.corejava.oops.inheritance.lab3;

public class MonsterTruck {

	public static void main(String[] args) {
	Truck tr=new Truck();	
  tr.m1();	
	tr.m2();
	System.out.println(tr);	

	}

}
class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("\ntruck 1");
    }

    public String toString() {
        return "vroom";
    }
}

 class Truck extends Car {
    public void m1() {
        System.out.print("monster 1");
    }
     
    public void m2() {
    	super.m2();//invoke parent class method m2
        super.m1();//invoking parent class method m1
    }
     
    public String toString() {
    	this.m1();
        return ( super.toString() + super.toString());
    }
}
