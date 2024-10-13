package com.accenture.abstraction;

public class Employe {
	private int employeeId;
	private String employeeName;

	public Employe(String employeeName, int employeeId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	void PrintEmployeeDetails() {
		System.out.println("Employee Name: " + this.employeeName);
		System.out.println("Employee Id: " + this.employeeId);

	}
	
}
