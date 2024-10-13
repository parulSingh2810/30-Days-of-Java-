package com.accenture2;

public class TestEmployee {
	public static void main(String[] args) {
		employee emp1= new employee();
//		emp1.empId =1234;
//		emp1.empName= "Parul";
//		emp1.salary =10897483.00;
		emp1.read_info1(1234, "Parul", 239147802.00);
		emp1.read_info(12344, "Nisarga", 2391478092.00);
		
		employee emp2= new employee();
//		emp2.empId = 5678;
//		emp2.empName = "Nisarga";
//		emp2.salary = 9074982346.00;
		emp2.read_info1(1234324, "Parul2", 22239147802.00);
		emp2.read_info(12344143, "Nisarga2", 22391478092.00);
		
		
		
		emp1.display();
		emp2.display();
		
		
	}

}
