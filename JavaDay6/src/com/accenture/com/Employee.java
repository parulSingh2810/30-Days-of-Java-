package com.accenture.com;

public class Employee implements Comparable<Employee>  {
	 private int Empid;
	 private String name;
	 private double salary;
	 
	
	public int getEmpid() {
		return Empid;
	}


	public void setEmpid(int empid) {
		Empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.Empid > o.Empid) {
			return 1;
			
		}
		else if(this.Empid < o.Empid){
			 return -1;
		}
		else return 0;
		
	}


	public Employee(int empid, String name, double salary) {
		super();
		Empid = empid;
		this.name = name;
		this.salary = salary;
	} 
	
}
