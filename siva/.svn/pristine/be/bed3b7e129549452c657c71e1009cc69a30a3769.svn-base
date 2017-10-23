package com.bcj.corejava.classes.simple.lab6;

public class Ticket {

	int startPoint,endPoint,ticketAmount;
	Ticket(){};
	Ticket(int startPoint,int endPoint)
	{
		this.startPoint=startPoint;
	this.endPoint=endPoint;
		
	}
	public int getStartPoint() {
		return startPoint;
	}
	public int getEndPoint() {
		return endPoint;
	}
	public int getTicketAmount() {
		return ticketAmount;
	}
	public boolean validateTravelPoints() 
	{
		if(endPoint>0 && endPoint>startPoint)
			return true;
		else
		{
			System.out.println("inavlid destination ");
			return false;
		}
	}
	
public void calculateTicketAmt ()
{
	ticketAmount=(endPoint-startPoint)*20;
	
}
}
