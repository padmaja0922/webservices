/**
 * 
 */
package com.bcj.psbregent.tenantportal.util;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


/**
 * This class is Utility class to read property file to get connection from JDBC
 *
 */


public class JDBCUtilByProperty {

	public static Connection getConnectionByProperty() {

		Connection con = null;
		System.out.println(con);

		Properties prop = new Properties();
		FileInputStream input = null;

		try {
			
			/**
			 *  Getting connection to database through Weblogic data source and returning the connection.
			 */
			/*
			Context context = new InitialContext();
	         DataSource ds = (DataSource) context.lookup("mydb");
		      con =  ds.getConnection();*/
			
			input = new FileInputStream("C:\\bcj-dec16\\workspace\\corejava\\PsbRegent\\src\\db.properties");

			prop.load(input);

			String driverClass = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");

			String password = prop.getProperty("password");

			Class.forName(driverClass);
			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			System.out.println(e);
		}
        System.out.println(con);
		
		return con;
	}

}
