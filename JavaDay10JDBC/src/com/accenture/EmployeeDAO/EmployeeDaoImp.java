package com.accenture.EmployeeDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.accenture.EmployeeBean.EmployeeBean;
import com.accenture.EmployeeUtility.DBUtility;

public class EmployeeDaoImp implements EmployeeDAO{

	@Override
	public void empAdd(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con =  DBUtility.getDbConnection();
		Statement stat = con.createStatement();

		int eid = emp.getEmpId();
		String name = emp.getEname();
		Double salary = emp.getSalary();
		
		
		String sql = "INSERT INTO employee_table VALUES(" + eid + " ,'" + name +"', " + salary +")";
		
		stat.executeUpdate(sql);
		DBUtility.closeConnection();
		
		
		
		
	}

	

}
