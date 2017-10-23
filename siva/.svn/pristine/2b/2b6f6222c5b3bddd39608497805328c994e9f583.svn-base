package com.psbussinesspark.tenentportal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.psbussinesspark.tenentportal.util.DbUtil;


/**
 * @author Bootcamp User 014
 *Retrieve the user id and password from database
 */
public class LoginDao {
	/**
	 *Retrieve user name and password and send for verification
	 */
	public static String verifyTanent(String user)
	{
		String result="";
		
		try {
		//get name and password by using user id
			/*//FileConnection fc=new FileConnection();*/
			/*Class.forName("com.mysql.jdbc.Driver"); java.sql.Connection
			  con=DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/pr_bussinesspark","root","siva");*/
			
		//getting user name and password from database with user id
			//java.sql.Connection con = DbUtil.getConnectionByProperties();
		java.sql.Connection con = DbUtil.getConnectionByDataSource();
		java.sql.PreparedStatement stmt = con.prepareStatement("select fName , password from customer where userId= ?");
		stmt.setNString(1, user);
		ResultSet rs =stmt.executeQuery();
		
		while (rs.next()) 
		result=rs.getString("fName")+" "+rs.getString("password");
			
		rs.close();
		stmt.close();
		con.close();
		return result;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
