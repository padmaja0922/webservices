package com.sivakiran.eliminationtest.controller;

import com.sivakiran.eliminationtest.service.PaymentService;
import com.sivakiran.eliminationtest.userinterface.PaymentUi;

public class PaymentController {
public static boolean sendCardDetails(PaymentUi dtls)
{
	boolean flag=PaymentService.athanticatePayment(dtls);
	return flag;
	}
}
