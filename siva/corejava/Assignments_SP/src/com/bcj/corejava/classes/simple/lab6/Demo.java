package com.bcj.corejava.classes.simple.lab6;

public class Demo {

	public static void main(String[] args) {
		
		Ticket newTicket=new Ticket();
		Ticket newTicket1=new Ticket(18,1);
		Ticket newTicket2=new Ticket(2,18);
		boolean flag=newTicket2.validateTravelPoints() ;
		if(flag==true)
		{
			newTicket2.calculateTicketAmt ();
			System.out.println("Ticket fiar :"+newTicket2.getTicketAmount());
	}

}}
