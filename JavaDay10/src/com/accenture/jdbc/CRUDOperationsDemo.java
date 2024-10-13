package com.accenture.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperationsDemo {
    
	public static void addEmp() throws ClassNotFoundException, SQLException   {
		Connection con = DBUtility.getDbConnection();
		Statement stat = con.createStatement();
		String sql = "INSERT INTO employee_table value (112,'papp',587234.00)";
		stat.executeUpdate(sql);
		DBUtility.closeConnection();
	}	
	public static void fetchEmp() throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getDbConnection();
		Statement stat = con.createStatement();
		String sql = "Select * from employee_table";
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +  rs.getDouble(3));
		}
		DBUtility.closeConnection();		
	}
	
	public static void Update() throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getDbConnection();
		Statement stat = con.createStatement();
		
		String sql = "update employee_table set salary = 2000 where EmpID = 1001";
		int n = stat.executeUpdate(sql);
		System.out.println(n);
		DBUtility.closeConnection();
	}
	public static void Delete() throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getDbConnection();
		Statement stat = con.createStatement();
		String sql = "delete from employee_table where EmpId = 1001";
		int n = stat.executeUpdate(sql);
		System.out.println(n);
		DBUtility.closeConnection();
		
		
	}
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		addEmp();
//		fetchEmp();
//		Update();
//		Delete();
		
		

	}

}
