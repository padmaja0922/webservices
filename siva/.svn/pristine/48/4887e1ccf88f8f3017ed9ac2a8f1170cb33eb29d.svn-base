/**
 * 
 */
package com.bcj.crud.dao;

import java.sql.SQLException;

import com.bcj.crud.model.Customer;
import com.bcj.crud.util.DbUtil;


/**
 * @author Bootcamp User 014
 *
 */
public class ModificationDao {
	public static boolean updateCustomer(Customer cust,int mode){
	java.sql.Connection con=null;
		if(mode==1)
			con=DbUtil.getConnectionByHardcode();
		else if(mode==2)
			 con=DbUtil.getConnectionByProperties();
	String query = "UPDATE customerdetails SET firstname=?, lastname=?, email=?, phonenumber=? where id = ?";

	      // create the mysql insert preparedstatement
	      java.sql.PreparedStatement stmt;
		try {
			  stmt = con.prepareStatement(query);
			  stmt.setString (1, cust.getfName());
		      stmt.setString (2, cust.getlName());
		      stmt.setString (3, cust.getEmail());
		      stmt.setString (4, cust.getNmbr());
		      stmt.setInt (5, cust.getId());
		     int rowsEffected = stmt.executeUpdate();
		      
		     if(rowsEffected!=0)
		    	 return true;
		      con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
		return false;}
	
}
