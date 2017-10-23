package com.sivakiran.eliminationtest.service;

import com.sivakiran.eliminationtest.database.PaymentDb;
import com.sivakiran.eliminationtest.userinterface.PaymentUi;

public class PaymentService {
public static boolean athanticatePayment(PaymentUi dtls)
{
	PaymentDb db=PaymentDb.retriveCardDetails();
	if(dtls.name==db.name && dtls.card==db.card && dtls.cvv == db.cvv &&
					(dtls.amount > 0 && dtls.amount<=db.amount))
		return true;
	
	return true;
		
		
}}
