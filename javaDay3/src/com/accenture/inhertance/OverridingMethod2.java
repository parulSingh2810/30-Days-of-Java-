package com.accenture.inhertance;



class Manager extends Emp{

int numberOfReportees;

public int getNumberOfReportees() {
	return numberOfReportees;
	
}

public void setNumberOfReportees(int numberOfReportees) {
	this.numberOfReportees = numberOfReportees;
}

@Override
public void printEmployeeDetails() {
	
	super.printEmployeeDetails();
	System.out.println(numberOfReportees);
	
}

	
	
}

public class OverridingMethod2 {

}
