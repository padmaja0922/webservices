package com.bcj.corejava.classes.medium.lab7;

/**
 * @author Bootcamp User 014
 *this class takes the details of the traveller and 
 * decides  to allow or deny
 */
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveller tvl=new Traveller();
		tvl.setTravellerId(1001);
		tvl.setBaggageAmount(80);
		tvl.setExpiryYear(2019);
		tvl.setNocStatus(true);
		Checks ck =new Checks();
		if(ck.checkBaggage(tvl) &&ck.checkImmigration(tvl) && ck.checkSecurity(tvl))
		System.out.println("Allow Traveller to fly");
		
		else System.out.println(" Detain Traveller for Re-Checking");;
		

	}

}
