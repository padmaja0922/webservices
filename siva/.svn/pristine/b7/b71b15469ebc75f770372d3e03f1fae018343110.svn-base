package com.psbussinesspark.tenentportal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psbussinesspark.tenentportal.model.Payment;
import com.psbussinesspark.tenentportal.service.PaymentHandler;

/**
 * @author Bootcamp User 014
 *  Takes the Payment information from user and verifies
 */
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Get Payment information from User interface and verifies with the data in file
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// getting parameters and populating model classes
		String cmpName = request.getParameter("cmpName");
		String name = request.getParameter("name");
		String nmbr = request.getParameter("nmbr");
		String date = request.getParameter("date");
		String cvv = request.getParameter("cvv");
		String amount = request.getParameter("amount");

		Payment pymnt = new Payment();
		pymnt.setName(name);
		pymnt.setNmbr(nmbr);
		pymnt.setDate(date);
		pymnt.setCvv(cvv);
		pymnt.setAmount(amount);
		pymnt.setCmpName(cmpName);

		boolean flag = PaymentHandler.handlePayment(pymnt);

		// if payment successful display message
		if (flag == true) {

			out.println(
					"<html><body style ='background-color:#ffbf80;'><h1 align ='center' style='color:black;font-size:200%'><strong>Payment Sucessfull<br><br><br>Thank you</strong></h1><</body></html>");
		} else
			out.println(
					"<html><body style ='background-color:#D34526;'><h1 align ='center' style='color:black;font-size:200%'><strong>Payment unsucessfull</strong></h1></body></html>");
	}

}
