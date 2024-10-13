package com.accenture.car;

public class TestCar {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car1 = new car();
		car1.read_info("Benz", "Mercedez", "white");
		car1.display();
		car1.accelerate(100);
		car1.applyBreak();
		car1.testDrive();
 
	}
 
}
