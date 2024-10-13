package com.accenture.EmployeeService;

import java.sql.SQLException;

import com.accenture.EmployeeBean.EmployeeBean;
import com.accenture.EmployeeDAO.EmployeeDAO;
import com.accenture.EmployeeDAO.EmployeeDaoImp;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void addEmp(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDAO empd = new EmployeeDaoImp();
		empd.empAdd(emp);
	}

	
	

}
