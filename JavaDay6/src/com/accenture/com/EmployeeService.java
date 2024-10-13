package com.accenture.com;

import java.util.ArrayList;

public class EmployeeService {
 void printdetails(ArrayList<Employee> e) {
	 e.forEach(x -> System.out.println(x.getEmpid()+ x.getName()+ x.getSalary()));
	 
	 
 }
}
