package com.accenture.EmployeeUI;

import java.sql.SQLException;

import com.accenture.EmployeeBean.EmployeeBean;
import com.accenture.EmployeeDAO.EmployeeDAO;
import com.accenture.EmployeeService.EmployeeService;
import com.accenture.EmployeeService.EmployeeServiceImpl;

public class UITester {
	
	public static void addEmp() throws ClassNotFoundException, SQLException {
		EmployeeBean emp = new EmployeeBean();
		emp.setEmpId(107867);
		emp.setEname("Ramu");
		emp.setSalary(342798.00);
		
		EmployeeService service = new EmployeeServiceImpl();
		service.addEmp(emp);
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		addEmp();
		
	}
}
