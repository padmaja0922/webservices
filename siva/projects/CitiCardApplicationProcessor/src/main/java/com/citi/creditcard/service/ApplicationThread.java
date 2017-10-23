package com.citi.creditcard.service;

import com.citi.creditcard.model.Customer;

public class ApplicationThread implements Runnable{
	
	Customer cst;
	
	ApplicationProcessor aplicpross;
	

	public ApplicationThread(Customer cst, ApplicationProcessor aplicpross) {
	
		this.cst = cst;
		this.aplicpross = aplicpross;
		
	}
      public void run() {
		// TODO Auto-generated method stub
		 System.out.println(Thread.currentThread().getName()+" (Start)"); 
		 aplicpross.verifyApplicationByScore(cst);
		   System.out.println(Thread.currentThread().getName()+" (End)");
		
	}

}

