package com.accenture.inhertance;

public class Emp extends Person {
	
		int empId;
		double salary;
		int performanceRating;
		
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getPerformanceRating() {
			return performanceRating;
		}
		public void setPerformanceRating(int performanceRating) {
			this.performanceRating = performanceRating;
		}
		Emp(){
			empId = 1234;
			salary = 23947029843.00;
			performanceRating =10;
		}
		Emp(int empId, double salary,int performanceRating){
			this.empId = empId;
			this.salary = salary;
			this.performanceRating = performanceRating;
			
		
		}
		
		public void printEmployeeDetails() {
			super.printEmployeeDetail();
			System.out.println(getEmpId());
			System.out.println(getSalary());
			System.out.println(getPerformanceRating());
//			System.out.println(getAge());
//			System.out.println(getFirstname());
//			System.out.println(getLastname());
			
			
		}
		
	


}
