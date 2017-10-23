package com.citi.creditcardprocess.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.citi.creditcardprocess.dao.ApplicationDao;
import com.citi.creditcardprocess.model.CreditCard;
import com.citi.creditcardprocess.model.Customer;









@Transactional
@Service
public class ApplicationProcessor {

	@Autowired
	private ApplicationDao dao;
	

	public void setApplicationDao(ApplicationDao dao) {
		this.dao = dao;
	}
	
	public void processApplication() {
	
		List<Customer> cstmr = dao.getApplicationByStatus();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Iterator itr = cstmr.iterator();
		while (itr.hasNext()) {

			Customer cst =(Customer)itr.next();
			Runnable applicThread = new ApplicationThread(cst , this);
			executor.execute(applicThread);
			
		}
		executor.shutdown();
		}
	
	
	public void verifyApplicationByScore(Customer cst){
	String line;
	String[] applicantDetails = null;
		

	InputStream file = this.getClass().getClassLoader().getResourceAsStream("creditscore.txt");
	Reader inputStreamReader = new InputStreamReader(file);

   try {
		
	BufferedReader br= new BufferedReader(inputStreamReader );
	while ((line = br.readLine()) != null) {
		applicantDetails = line.split(" ");
	
		if (applicantDetails[0].equals(cst.getfName())&&(Integer.parseInt(applicantDetails[1]) >= 450))
		generateCreditcard(cst);

		else if(applicantDetails[0].equals(cst.getfName())&&(Integer.parseInt(applicantDetails[1]) < 450))
			sendEmail(cst);
	}	
	} 
   catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	        

			
	}


	private void sendEmail(Customer cst) {
		
		new EmailService().sendEmail("citibankcreditcard.info@gmail.com", "citicreditcard",
				  cst.getEmail(), "creditcard status",
				 "Hello "+cst.getfName()+
				 " your credit card application is processed we are sorry we are unable to process your request at this moment"
				 + "please try next time after 2 months");
	}

	public void generateCreditcard(Customer cst) {

		CreditCard creditCard = new CreditCard();
		
		int i = 0;
		String creditCardNumber = "";
		Random r = new Random();
		while (i < 4) {
			long creditCardNumbergrp = r.nextInt(9000) + 1000;
			creditCardNumber = creditCardNumber + " " + creditCardNumbergrp;
			i++;
		}
		int creditLimit = 10000;
		String CVV = Integer.toString(r.nextInt(900) + 100);
		creditCard.setNameOnCard(cst.getfName() + " " + cst.getlName());
		creditCard.setCardLimit(creditLimit);
		creditCard.setCreditCardNumber(creditCardNumber);
		creditCard.setCVV(CVV);
		Calendar expiryDate = Calendar.getInstance();
		expiryDate.setTime(new Date());
		Format f = new SimpleDateFormat("dd-MMMM-yyyy");
		expiryDate.add(Calendar.YEAR, 4);
		creditCard.setExpiryDate(f.format(expiryDate.getTime()));
		creditCard.setCustId(cst.getId());
		creditCard.setCardStatus("Not Active");
		cst.setApplicationStatus("Processed");
		
		cst.setProcessStatus("Approved");
		
		dao.updateStatus(cst);
		
		dao.saveCreditCardDetails(creditCard);
		sendEmail( cst ,creditCard);
		
	}

	public void sendEmail(Customer cst, CreditCard creditCard) {

		
		if("Approved".equals(cst.getProcessStatus())){
		new EmailService(). sendEmail("citibankcreditcard.info@gmail.com", "citicreditcard",
		  cst.getEmail(), "creditcard status",
		  "Hello "+cst.getfName()+
		  " your credit card application is processed and it is approved  your credit limit is"
		  +creditCard.getCardLimit()+"and your card number is"+creditCard.getCreditCardNumber());
		}
		
	}
}
