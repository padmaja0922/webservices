/**
 * 
 */
package com.bcj.crud.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bcj.crud.model.Customer;
import com.bcj.crud.util.DbUtil;


/**
 * @author Bootcamp User 014
 *Establishing connection to database and inserting data into database
 */
public class RegistrationDao {

	public static int saveCustomer(Customer cust,int mode) 
	{
		 int id=0;Connection con=null;
		try {
			if(mode==1)
				con=DbUtil.getConnectionByHardcode();
			else if(mode==2)
				 con=DbUtil.getConnectionByProperties();
			String query = " insert into customerdetails (firstname, lastname, email,phonenumber)"
			        + " values (?, ?, ?, ?)";

			      // create the mysql insert preparedstatement
			      java.sql.PreparedStatement stmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			      stmt.setString (1, cust.getfName());
			      stmt.setString (2, cust.getlName());
			      stmt.setString (3, cust.getEmail());
			      stmt.setString (4, cust.getNmbr());
			      stmt.executeUpdate();
			      ResultSet rs = stmt.getGeneratedKeys();
			      
			      if (rs.next()) 
			    	  id= rs.getInt(1);
			      con.close();
			     
			
		} 
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*finally
		{ con.close();}*/
		
		return id;
		
	}
}
