package com.bcj.psbregent.tenantportal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcj.psbregent.tenantportal.entity.CreditCard;
import com.bcj.psbregent.tenantportal.service.PaymentService;

/**
 * Servlet implementation class PaymentServlet
 */
//@WebServlet("/PaymentServlet")

public class PaymentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	// @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/**
		 * loading form credit card details to local variables and passing them to service 
		 * layer for verification
		 * 
		 */
		
		String creditNo = request.getParameter("CreditCardno");
		String name = request.getParameter("NameOnCreditCard");
    	String cvvNo = request.getParameter("CVVno");
		String exp =request.getParameter("ExpiryDate");		
		float amount = Float.parseFloat(request.getParameter("Amount"));

		CreditCard card = new CreditCard(creditNo, name, cvvNo, exp, amount);

		int x = PaymentService.verifyCardDetails(card);
       
		/**
		 * checking which variable in credit card is invalid and redirecting to payment page if false.
		 */
		
		if (x == 1) {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html> <body>");
			out.println("<h3> Invalid Card Number </h3>");
            out.println("<h3> Please Enter Credit Card Details again</h3>");
            out.println("<a href =\"payment.html\">Payment</a>");
          
			out.print("</body> </html>");

		} else if (x == 2) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h3> Invalid Name On Card </h3> ");
			out.println("<h3> Please Enter Credit card details again</h3>");
			out.println("<a href =\"payment.html\">Payment</a>");
			out.print("</body> </html>");
			
		} else if (x == 3) {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html> <body>");
			out.println("<h3> Invalid CVV number</h3>");
			out.println("<h3> Please Enter Credit card details again</h3>");
			out.println("<a href =\"payment.html\">Payment</a>");
			out.print("</body> </html>");

		}else if (x == 4) {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html> <body>");
			out.println("<h3> Invalid Expiry Date</h3>");
			out.println("<h3> Please Enter Credit card details again</h3>");
			out.println("<a href =\"payment.html\">Payment</a>");
			out.print("</body> </html>");
			
		} else if (x == 5) {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html> <body>");
			out.print("<h3> Credit Limit is less than your Amount   </h3>");
			out.print("Please enter Payment another card details ");
			out.println("<a href =\"payment.html\">Payment</a>");
			out.print("</body> </html>");

		} else {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html> <body>");
			out.print("<h3> Payment Sucess  </h3>");
			out.print("Thank you for Renting from PSB REGENT");
			out.print("</body> </html>");
		}
		
		
	}

}
