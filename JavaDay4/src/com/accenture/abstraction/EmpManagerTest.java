package com.accenture.abstraction;

public class EmpManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("Parul", 1001, 10);
		manager.PrintEmployeeDetails();
		
		//For getting Employee id , EMployee name and number of Reportees
		
		System.out.println(manager.getEmployeeId());
		System.out.println(manager.getEmployeeName());
		System.out.println(manager.getNumberOfReportees());

	}

}
