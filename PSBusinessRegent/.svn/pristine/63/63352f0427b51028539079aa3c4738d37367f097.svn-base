/**
 * 
 */
package com.bcj.psbregent.tenantportal.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bcj.psbregent.tenantportal.entity.CreditCard;


/**
 * @author Boot Camp User 008
 *  
 *  This class receives credit card details from PaymentService class and verifies with data stored in text file 
 *   and returns the result. 
 */
public class PaymentDao {

	/**
	 * @param card
	 * @return
	 */
	public static int verifyCardDetails(CreditCard card) {
		
		
		BufferedReader inputFile = null;
		String input = "C:\\bcj-dec16\\workspace\\corejava\\PsbRegent\\src\\com\\bcj\\pbsregent\\dao\\CreditCardInfo.txt";

		int x = 0;

		try {

			inputFile = new BufferedReader(new FileReader(input));

			String lineOfText = inputFile.readLine();

			while (lineOfText != null) {

				String[] str = lineOfText.split(",");

				if (str[0].equals(card.getCardNo())) {

					if (str[1].equals(card.getName())) {

						if (str[2].equals(card.getCvv())) {

							if (str[3].equals(card.getExpDate())) {

								if (card.getAmount() < (Float.parseFloat(str[4]))) {
									x = 6;
									break;

								} else {
									x = 5;
									lineOfText = inputFile.readLine();
								}

							} else {
								x = 4;
								lineOfText = inputFile.readLine();
							}
						} else {
							x = 3;
							lineOfText = inputFile.readLine();
						}

					} else {
						x = 2;
						lineOfText = inputFile.readLine();
					}

				} else {
					x = 1;
					lineOfText = inputFile.readLine();
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		finally {

			try {
				inputFile.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
		return x;	
		
	}
	

}
