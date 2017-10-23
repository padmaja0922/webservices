package com.bcj.corejava.oops.abstractclasses.lab1;

abstract class AbstarctMamals {
	String creature;
//base anstract class
	abstract void live();

}

abstract class LandMammal extends AbstarctMamals {
	void live() {
		creature = "lion";
		System.out.println("i am a " + creature + " ,i live in forest ");
//abstract Landmammal class
	}

	abstract void hunt();
}

abstract class WaterMammal extends AbstarctMamals {
	void live() {
		creature = "whale";
		System.out.println("i am a " + creature + ",i live in water ");
//abstract Watermammal class
	}

	abstract void swim();

}

class Lion extends LandMammal {
	void hunt() {
		System.out.println("i am hunter \ni am the king of jungle");
	}
}

class Whale extends WaterMammal {
	void swim() {
		System.out.println("i am a swimmer \ni am bigger");
	}
}
