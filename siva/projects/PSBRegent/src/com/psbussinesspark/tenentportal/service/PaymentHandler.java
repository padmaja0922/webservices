package com.psbussinesspark.tenentportal.service;


/**
 * @author Bootcamp User 014
 *  Takes the Payment information from user and verifies
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.psbussinesspark.tenentportal.dao.PaymentDao;
import com.psbussinesspark.tenentportal.model.Payment;

public class PaymentHandler {
	/**
	 * Get Payment information from User interface and verifies with the data in file
	 */
	public static boolean handlePayment(Payment pymnt) throws IOException {
		String line = "";

		try {

			BufferedReader br = new BufferedReader(
					new FileReader("C:\\BCJ_DEC-2016\\Workspace\\Practice workspace\\PSBRegent\\src\\payment.txt"));
			while ((line = br.readLine()) != null) {
               //reading data from file and match details
				if (line.contains(pymnt.getName())) {
				String[] card = line.split(" ");
				//Comparing user enter data with the existing data in file
				if (card[1].equals(pymnt.getNmbr()) && card[2].equals(pymnt.getDate())
				&& card[3].equals(pymnt.getCvv()) && card[4].equals(pymnt.getAmount())) {
				PaymentDao.savePaymentRecord("paid", pymnt.getCmpName());
				return true;
					}
				} else
					continue;
			}
			br.close();

					



		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
