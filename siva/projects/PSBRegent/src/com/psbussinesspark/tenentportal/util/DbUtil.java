/**
 * 
 */
package com.psbussinesspark.tenentportal.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author Bootcamp User 014
 *
 */
public class DbUtil {

	static Connection con;

	public static Connection getConnectionByProperties() {
		String fileName = "C:\\BCJ_DEC-2016\\Workspace\\Practice workspace\\PSBRegent\\src\\dbconnection.properties";
		Properties props = new Properties();
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(fileName);
			props.load(fis);

			// load the Driver Class
			Class.forName(props.getProperty("driver"));

			// create the connection now
			con = DriverManager.getConnection(props.getProperty("url"), props.getProperty("user"),
					props.getProperty("password"));
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return con;
	}

	public static Connection getConnectionByDataSource() throws NamingException, SQLException {
		if (con != null) {
			return con;
		}

		try {
			Context context = new InitialContext();

			DataSource ds = (DataSource) context.lookup("mydb");
			con = ds.getConnection();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;

	}

}
