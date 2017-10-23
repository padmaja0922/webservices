package com.bcj.corejava.classes.medium.lab7;

public class Checks {
	/**
	 * @param t
	 * @return
	 * checks for baggage of traveller
	 */
	public boolean  checkBaggage(Traveller t){
		if (t.getBaggageAmount()>=0 && t.getBaggageAmount()<=40)
				return true;
		else 
			return false;			
		}
	/**
	 * @param t
	 * @return
	 * checks for the immigration  expiry status of  traveller 
	 */
	public boolean checkImmigration(Traveller t)
	{
		if(t.getExpiryYear()>=2001 && t.getExpiryYear()<=2025)
			return true;
		else 
			return false;
		
	}
	/**
	 * @param t
	 * @return
	 * checks for the nocStatus of the traveller
	 */
	public boolean checkSecurity(Traveller t)
	{
		if(t.isNocStatus())
			return true;
		else 
			return false ;
		
	}


}
