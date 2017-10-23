/**
 * 
 */
package com.bcj.psbregent.tenantportal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bcj.psbregent.tenantportal.util.JDBCUtilByProperty;
import com.mysql.jdbc.PreparedStatement;

/**
 * @author Boot Camp User 008
 * 
 *         This class gets input from LoginServive and verifies with data from
 *         database and returns result
 * 
 */

public class LoginDao {

	/**
	 * @param userId
	 * @param password
	 * @return result
	 */

	public static boolean verifyLogin(String userId, String password) {

		Connection con = null;
		int i = 0;
		try {

			con = JDBCUtilByProperty.getConnectionByProperty();

			PreparedStatement pstmt = (PreparedStatement) con
					.prepareStatement("SELECT password FROM `company` WHERE `userid` = ?");
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				if (rs.getString(1).equals(password))
					i = 1;
			}
			
		} catch (Exception e) {
			System.out.println(e);
			
		} finally {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		if (i == 1)
			return true;
		else
			return false;

	}

}
