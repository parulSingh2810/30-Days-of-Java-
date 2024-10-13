package com.accenture.EmployeeService;

import java.sql.SQLException;

import com.accenture.EmployeeBean.EmployeeBean;

public interface EmployeeService {
	public void addEmp(EmployeeBean emp)throws ClassNotFoundException, SQLException;
}
