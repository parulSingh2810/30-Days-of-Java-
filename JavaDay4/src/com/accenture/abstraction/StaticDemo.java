package com.accenture.abstraction;
class Employee{
	int Empid;
	String name;
	double salary;
	static String ceo;
	static {
		System.out.println("This is static block");
		ceo ="Julie sweet";
	}
	public Employee() {
		System.out.println("this is constructor");
	}
	
	void display() {
		System.out.println("Empid  is "+ " "+ Empid +"\n"+"Salary is "+ "\n"+ salary+"\n"+"name is "+"\n"+ name+"\n"+ "ceo is "+ ceo );
	}
//	static void display1() {
//		System.out.println(ceo);
//	}
	
}
public class StaticDemo {
// can''t use instance variable inside static method 
	int i= 0;
	static int x = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo d = new StaticDemo();
		d.i = 89;
		d.x =90;
		
		System.out.println();
		Employee emp1 = new Employee();
		emp1.Empid = 1001;
		emp1.name = "Parul";
		emp1.salary = 230750942.00;
		emp1.display();
//		System.out.println(Employee.ceo);
		
		
		Employee emp2 = new Employee();
		emp2.Empid = 1002;
		emp2.name = "Nisarga";
		emp2.salary = 2307509442.00;
		emp2.display();
		System.out.println(Employee.ceo);
		
		
		
		
		
		
	}

}
