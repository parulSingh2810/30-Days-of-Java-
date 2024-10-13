package com.accenture.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {
	public static void addEmp() throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getDbConnection();
		String sql = " INSERT INTO employee_table values(?,?,?)";
		
		
		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setInt(1,100912);
		pstat.setString(2,"Singh");
		pstat.setDouble(3, 834963.00);
		int n= pstat.executeUpdate();
		System.out.println(n);
		
		
		
	}
	public static void fetchEmp() throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getDbConnection();
		String sql = " INSERT INTO employee_table values(?,?,?)";
		
		
		PreparedStatement pstat = con.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +  rs.getDouble(3));
		}
		DBUtility.closeConnection();
		
	}

	public static void Update() throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getDbConnection();
		
		
		String sql = "update employee_table set salary = 20900 where EmpID = 1001";
		PreparedStatement pstat = con.prepareStatement(sql);
		int n = pstat.executeUpdate(sql);
		System.out.println(n);
		DBUtility.closeConnection();
		
	}
	
	public static void Delete() throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getDbConnection();
		
		String sql = "delete from employee_table where EmpId = 1001";
		PreparedStatement pstat = con.prepareStatement(sql);
		int n = pstat.executeUpdate(sql);
		System.out.println(n);
		DBUtility.closeConnection();
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
     addEmp();
     Delete();
     Update();
     fetchEmp();
	}

}
