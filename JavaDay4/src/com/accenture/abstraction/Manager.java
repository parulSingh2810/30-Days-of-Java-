package com.accenture.abstraction;

public class Manager extends Employe {
	private int numberOfReportees;
//Constructor	
	
	public Manager(String employeeName, int employeeId, int numberOfReportees) {
		super(employeeName, employeeId);
		this.numberOfReportees = numberOfReportees;
	}

//	Getter ans setters
	public int getNumberOfReportees() {
		return numberOfReportees;
	}

	public void setNumberOfReportees(int numberOfReportees) {
		this.numberOfReportees = numberOfReportees;
	}	
// Desplaying Employee details

	public void PrintEmployeeDetails() {
		System.out.println("Number of reportees: " + this.numberOfReportees);
	}
}
