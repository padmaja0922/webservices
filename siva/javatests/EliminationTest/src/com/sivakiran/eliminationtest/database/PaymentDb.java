package com.sivakiran.eliminationtest.database;

public class PaymentDb {
	public String card;
	public String name;
	public String cvv;
	public int amount;
	public static PaymentDb retriveCardDetails()
	{
		PaymentDb db= new PaymentDb();
		db.card="123454321";
		db.name="sivakiran";
		db.cvv="404";
		db.amount=500;
		return db;
		
	}

}
