package com.bcj.crud.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
	public static Connection getConnectionByProperties() {
		Properties props = new Properties();
		FileInputStream fis = null;
		Connection con = null;
		try {
			fis = new FileInputStream("C:\\BCJ_DEC-2016\\Workspace\\Practice workspace\\CustomerPortal\\src\\dbconnection.properties");
			props.load(fis);

			// load the Driver Class
			Class.forName(props.getProperty("driver"));

			// create the connection now
			con = DriverManager.getConnection(props.getProperty("url"),
					props.getProperty("user"),
					props.getProperty("password"));
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static Connection getConnectionByHardcode()
	{
		
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/customer","root","siva");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
}
