package com.accenture.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		System.out.println("Connection establised");
		Statement stat = com.createStatement();
		int n = stat.executeUpdate("INSERT INTO employee_table value (1003,'riya',43208.00)");
		System.out.println("insert into row"+n);
		stat.close();
		com.close();
		

	}

}
