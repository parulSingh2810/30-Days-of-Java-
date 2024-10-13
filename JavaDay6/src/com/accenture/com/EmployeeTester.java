package com.accenture.com;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1001, "Parul", 123879.00);
		Employee emp2 = new Employee(10056, "Tanya", 3678688492.00);
		Employee emp3 = new Employee(1003, "Nisarga", 3248924.00);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		EmployeeService services = new EmployeeService();
		services.printdetails(al);
		
//		-----------------------
		Collections.sort(al);
		services.printdetails(al);
		
		
//		-------------------------------------------
		System.out.println("Using id comparator");
		Collections.sort(al, new IdComparator());
		services.printdetails(al);
		
		System.out.println("using name comparator");
		
		Collections.sort(al, new NameComparator());
		services.printdetails(al);
		System.out.println("using salary comparator");
		
		Collections.sort(al, new salaryComparator());
		services.printdetails(al);
		
		
		
		

	}

}
