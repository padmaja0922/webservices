/**
 * 
 */
package com.bcj.psbregent.tenantportal.service;

import com.bcj.psbregent.tenantportal.dao.PaymentDao;
import com.bcj.psbregent.tenantportal.entity.CreditCard;

/**
 * @author Boot Camp User 008
 *
 */
public class PaymentService {

	/**
	 * @param card
	 * @return int
	 *  
	 * this method passes the credit card details from controller to dao layer to verify wherther they match with
	 * Existing data.
	 * 
	 */
	public static int verifyCardDetails(CreditCard card) {
		
       int x = PaymentDao.verifyCardDetails(card);
		
		return x;
	}

}
