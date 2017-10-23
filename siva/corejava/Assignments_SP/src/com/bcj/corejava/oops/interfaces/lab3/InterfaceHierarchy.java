package com.bcj.corejava.oops.interfaces.lab3;

public interface InterfaceHierarchy {

}
interface LandMammal extends InterfaceHierarchy
{
	public void walk();
	public void run();
	}
interface WaterMammal extends InterfaceHierarchy
{
	public void swim();
	
	}
class Lion implements LandMammal
{
	public void walk()
	{
		System.out.println("i walk");
	}
	public void run(){
		System.out.println("but,i am running");
	}}
class Human implements LandMammal
{
	public void run(){
		System.out.println("i can run");}
	public void walk()
	{
		System.out.println("but,i am walking");
	}
	
}
	class Whale implements WaterMammal
	{
		public void swim()
		{
			System.out.println("i am a good swimmer");
		}
	}
	
	