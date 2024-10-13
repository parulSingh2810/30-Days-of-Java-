package com.accenture.inhertance;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Manager e = new Manager();
     Emp em = new Emp();
     
     e.setNumberOfReportees(40);
     e.printEmployeeDetails();
	}

}
