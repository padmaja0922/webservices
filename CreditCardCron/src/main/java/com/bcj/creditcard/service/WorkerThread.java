package com.bcj.creditcard.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Random;

import org.apache.log4j.Logger;

import com.bcj.creditcard.dao.CustomerDao;
import com.bcj.creditcard.entity.CreditCard;
import com.bcj.creditcard.entity.Customer;

public class WorkerThread implements Runnable {

	Customer cust;
	CustomerDao custDao;
	
	private static Logger logger = Logger.getLogger(WorkerThread.class);

	WorkerThread(Customer cust, CustomerDao custDao) {

		this.cust = cust;
		this.custDao = custDao;
	}

	public void run() {

		try {
			
			validateCustomer(cust);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private void validateCustomer(Customer customer) throws IOException {

		String line = "";

		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("ApplicantDetails.txt");

		
		BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));

		while ((line = r.readLine()) != null) {

			System.out.println(line);
			String splitStr[] = line.split(" ");
			

			CreditCard card = new CreditCard();

			if (customer.getFirstName().equalsIgnoreCase(splitStr[0])
					&& customer.getLastName().equalsIgnoreCase(splitStr[1]) && customer.getSsn().equals(splitStr[2])) {

				if (Integer.parseInt(splitStr[3]) >= 750 || customer.getEmpDetails().getAnnualIncome() > 120000) {
					card.setCreditLimit(5000);
					setCardDetails(customer, card);

				}

				else if (Integer.parseInt(splitStr[3]) > 650 || Integer.parseInt(splitStr[3]) < 750
						&& customer.getEmpDetails().getAnnualIncome() > 75000) {
					card.setCreditLimit(3000);
					setCardDetails(customer, card);

				}

				else if (Integer.parseInt(splitStr[3]) < 650 || Integer.parseInt(splitStr[3]) > 550
						&& customer.getEmpDetails().getAnnualIncome() > 50000) {
					card.setCreditLimit(1000);
					setCardDetails(customer, card);
				}

				else{
					customer.setStatus("Declined");

					MailService mail = new MailService();
					mail.sendMail(customer, card);
                     
                    custDao.updateCustomer(customer);
				}

				break;
			}

			/*else{
				customer.setStatus("Declined");
				custDao.updateCustomer(customer);
			      MailService mail = new MailService();
			      mail.sendMail(customer, card);
			      break;
			}
			*/
			
		}

	}

	private void setCardDetails(Customer customer, CreditCard card) {

		System.out.println(custDao);

		customer.setStatus("Approved");
		card.setcId(customer.getId());

		Random rd = new Random();
		String cardNo = "" + rd.nextInt(9999) + " " + rd.nextInt(9999) + " " + rd.nextInt(9999) + " "
				+ rd.nextInt(9999);

		card.setCardNo(cardNo);
		card.setCvvNo(rd.nextInt(999) + 100);
		card.setName(customer.getFirstName() + " " + customer.getLastName());

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 3);
		String expDate = "" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);

		card.setExpDate(expDate);
        card.setStatus("new");
		custDao.saveCreditCard(customer, card);
		

		MailService mail = new MailService();
		mail.sendMail(customer, card);

		 logger.info("after validateing customer details :" + cust);
		 logger.info("and card details "+ card);
		 

	}

}
