package com.bcj.corejava.oops.abstractclasses.lab1;

public class AbstarctStarter {

	public static void main(String[] args) {
	
		AbstarctMamals am=new Lion();
		LandMammal lm=new Lion();
		 am.live();
         lm.hunt();
         System.out.println();// class to call abstarct methods
         AbstarctMamals am1=new Whale();
         am1.live();
         WaterMammal wm=new Whale();
         wm.swim();
	}

}
