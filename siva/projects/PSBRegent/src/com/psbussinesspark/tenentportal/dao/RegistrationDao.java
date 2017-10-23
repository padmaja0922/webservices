/**
 * 
 */
package com.psbussinesspark.tenentportal.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.psbussinesspark.tenentportal.model.Company;
import com.psbussinesspark.tenentportal.util.DbUtil;


/**
 * @author Bootcamp User 014
 *Takes the information and store in database
 */
public class RegistrationDao {

	
	/**
	 *save the details in database by using sql queries
	 */
	public static int saveTenentDetails(Company cpny) {

		int custId = 0,adrsId=0,cmpId=0;
		
		try {
			/* Class.forName("com.mysql.jdbc.Driver"); java.sql.Connection
			  con=DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/pr_bussinesspark","root","siva");
			 
			FileConnection fc=new FileConnection();
			java.sql.Connection con = DbUtil.getConnectionByProperties();*/
			
			java.sql.Connection con = DbUtil.getConnectionByDataSource();
			String query = " insert into customer (fName, lName,phone, email,userId,password)"
					+ " values (?, ?, ?, ?,?,?)";

			// create the mysql insert preparedstatement for customer
			java.sql.PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, cpny.getCust().getfName());
			stmt.setString(2, cpny.getCust().getlName());
			stmt.setString(3, cpny.getCust().getPhone());
			stmt.setString(4, cpny.getCust().getEmail());
			stmt.setString(5, cpny.getCust().getUserId());
			stmt.setString(6, cpny.getCust().getPassword());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next())
			custId = rs.getInt(1);
			
			
			// create the mysql insert preparedstatement for address
			String  qry1= " insert into address (line1, line2,city, state,zip)"
					+ " values (?, ?, ?, ?,?)";
			java.sql.PreparedStatement stmt1 = con.prepareStatement(qry1, Statement.RETURN_GENERATED_KEYS);
			stmt1.setString(1,cpny.getAdrs().getLine1());
			stmt1.setString(2,cpny.getAdrs().getLine2());
			stmt1.setString(3,cpny.getAdrs().getCity());
			stmt1.setString(4,cpny.getAdrs().getState());
			stmt1.setString(5,cpny.getAdrs().getZip());
			stmt1.executeUpdate();
			ResultSet rs1 = stmt.getGeneratedKeys();
			if (rs1.next())
			adrsId = rs1.getInt(1);
			

			
			// create the mysql insert preparedstatement for company
			String qry2 = " insert into company (cmpName,cmpPhone, cmpEmail,custId,adrsId)"
					+ " values (?, ?, ?,?,?)";
			java.sql.PreparedStatement stmt2 = con.prepareStatement(qry2, Statement.RETURN_GENERATED_KEYS);
			stmt2.setString(1,cpny.getCmpName());
			stmt2.setString(2,cpny.getCmpPhone());
			stmt2.setString(3,cpny.getCmpEmail());
			stmt2.setInt(4,custId);
			stmt2.setInt(5,adrsId);
			stmt2.executeUpdate();
			ResultSet rs2 = stmt2.getGeneratedKeys();
			if (rs2.next())
			cmpId = rs2.getInt(1);
			con.close();
			return cmpId;
			
			
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * finally { con.close();}
		 */
		return 0;

	}
}
