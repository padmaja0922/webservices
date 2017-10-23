package com.psbussinesspark.tenentportal.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psbussinesspark.tenentportal.service.LoginService;

/**
 * @author Bootcamp User 014
 *Takes the Login information from user Interface
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  /**
	  * Getting user id and password and verify with data in database
	  */
	   @Override
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// getting parameters and verifying with details in database
		String user = request.getParameter("user");
		String code = request.getParameter("code");
		String result = LoginService.verifyTanent(user, code);
		
		//if login successful open Payment link
		if (result != null) {
			out.println(
		"<html><body style ='background-color:#DAF7A6;'><h1 style='color:black;font-size:200%'><strong>Welcome "
	   + result
		+ " ! </strong></h1><br><div  style='color:red;font-size:150%'><a href='Payment.html'>click here for Payment</a></div></body></html>");

		}
		else
		out.println(
		"<html><body style ='background-color:#D34526;'><h1 align ='center' style='color:black;font-size:200%'><strong>Login Failed</strong></h1></body></html>");
			

	}

}
