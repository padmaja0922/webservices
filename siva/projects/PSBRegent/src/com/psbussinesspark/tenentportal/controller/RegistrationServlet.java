package com.psbussinesspark.tenentportal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psbussinesspark.tenentportal.model.Address;
import com.psbussinesspark.tenentportal.model.Company;
import com.psbussinesspark.tenentportal.model.Customer;
import com.psbussinesspark.tenentportal.service.RegistrationHandler;



/**
 * @author Bootcamp User 014
 *Takes the information from user interface and store in database
 */
//@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Getting parameters and save in database
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String cmpName = request.getParameter("cmpName");
		String cmpPhone = request.getParameter("cmpPhone");
		String cmpEmail = request.getParameter("cmpEmail");

		Company cpny = new Company();
		cpny.setCmpName(cmpName);
		cpny.setCmpPhone(cmpPhone);
		cpny.setCmpEmail(cmpEmail);

		String line1 = request.getParameter("line1");
		String line2 = request.getParameter("line2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");

		Address adrs = new Address();
		adrs.setLine1(line1);
		adrs.setLine2(line2);
		adrs.setCity(city);
		adrs.setState(state);
		adrs.setZip(zip);

		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String userId = request.getParameter("userId");

		Customer cust = new Customer();
		cust.setfName(fName);
		cust.setlName(lName);
		cust.setPhone(phone);
		cust.setEmail(email);
		cust.setUserId(userId);
		cust.setPassword(password);

		cpny.setAdrs(adrs);
		cpny.setCust(cust);

		int cmpId = RegistrationHandler.saveTenentDetails(cpny);
		//if registration successful open login page
		if (cmpId >0) {
			out.println(
		   "<html><body style ='background-color:#ffff80;'><h1 align ='center' style='color:black;font-size:200%'><strong>Registration Sucessfull</strong></h1><br><div align='cente' style='color:red;font-size:150%'><a href='login.html'>click here to login</a></div></body></html>");
			out.println("<br><br><br><h2>Your Company Id:"+cmpId+"</h2>");
		}
			else
			out.println(
		 "<html><body style ='background-color:#D34526;'><h1 align ='center' style='color:black;font-size:200%'><strong>Registration Failed</strong></h1></body></html>");
		

		

	}

}
