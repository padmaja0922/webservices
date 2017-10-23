/**
 * 
 */
package com.bcj.crud.dao;

import java.sql.SQLException;

import com.bcj.crud.util.DbUtil;


/**
 * @author Bootcamp User 014
 *
 */
public class RefinementDao {
	public static boolean deleteCustomer(int id,int mode)
	{
		java.sql.Connection con=null;
		if(mode==1)
			con=DbUtil.getConnectionByHardcode();
		else if(mode==2)
			 con=DbUtil.getConnectionByProperties();
		String query = "Delete From customerdetails where id = ?";
		java.sql.PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(query);
			stmt.setInt (1, id);
			int rowsEffected = stmt.executeUpdate();
		      
		     if(rowsEffected!=0)
		    	 return true;
		      con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
}
