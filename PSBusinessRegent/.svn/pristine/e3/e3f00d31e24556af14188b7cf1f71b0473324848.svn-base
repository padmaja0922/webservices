package com.bcj.psbregent.tenantportal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcj.psbregent.tenantportal.service.LoginService;


/**
 * Servlet implementation class LoginServlet
 */


// @WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	// @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userId");
		String password = request.getParameter("password");

		boolean result = LoginService.verifyLogin(userId, password);

		/**
		 * after getting result from LoginService class if true directing to pay rent else to login page again
		 */
		
		if (result == false) {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html> <body>");
			out.println("<h3> Login failed </h3>");
			out.println("<a href='login.html'> login</a>");
			out.print("</body> </html>");

		} else {
			response.setContentType("text/html ");
			PrintWriter out = response.getWriter();
			out.println("<html> <body>");
			out.println("<h2>Login Sucess</h2> ");
			out.println("<h2>Click Link below to pay rent</h2> ");
			out.println("<a href=\"payment.html\">pay</a>");
			out.print("</body> </html>");
		}

	}

}
