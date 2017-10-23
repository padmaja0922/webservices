package com.psbussinesspark.tenentportal.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.psbussinesspark.tenentportal.util.DbUtil;


/**
 * @author Bootcamp User 014
 *save Payment record in database
 */

public class PaymentDao {
	/*
	 *execute update query to save payment
	 */	
public static void savePaymentRecord(String status,String cmpName)
{
	 
	try {//updating rent payment status by using company name 
		/*//FileConnection fc=new FileConnection();*/
		//java.sql.Connection con = DbUtil.getConnectionByProperties();
		 /*Class.forName("com.mysql.jdbc.Driver"); java.sql.Connection
		  con=DriverManager.getConnection(
		  "jdbc:mysql://localhost:3306/pr_bussinesspark","root","siva");*/
		java.sql.Connection con = DbUtil.getConnectionByDataSource();
		java.sql.PreparedStatement stmt = con.prepareStatement(" update  company set rent = ? where cmpName = ?");
		stmt.setString(1,status);
		stmt.setString(2,cmpName);
		stmt.executeUpdate();
		con.close();
	} 
	catch (SQLException e) {
		e.printStackTrace();
		
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
