package com.accenture.EmployeeDAO;

import java.sql.SQLException;

import com.accenture.EmployeeBean.EmployeeBean;

public interface EmployeeDAO  {
	public void empAdd(EmployeeBean emp)throws ClassNotFoundException, SQLException;
		
	
}
