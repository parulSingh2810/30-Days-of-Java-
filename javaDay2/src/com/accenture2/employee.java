package com.accenture2;

public class employee {
	int empId;
	String empName;
	double salary;
	void read_info1(int empId1, String empName1, double salary1) {
		empId = empId1;
		empName = empName1;
		salary = salary1;
		
	}
	void read_info(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		
	}
	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
	}
}
