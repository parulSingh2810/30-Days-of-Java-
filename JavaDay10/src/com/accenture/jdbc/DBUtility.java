package com.accenture.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {

	public static String url = "";
	public static String username = "root";
	public static String password = "root";
	public static Connection con = null;
	public static Connection getDbConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
		return con;
		
		
	}
	public static void closeConnection() throws SQLException {
	 con.close();
	}
}
