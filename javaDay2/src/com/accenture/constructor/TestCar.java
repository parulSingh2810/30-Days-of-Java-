package com.accenture.constructor;

public class TestCar {
		 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Car car1 = new Car();
			Car car2 = new Car("Audi","Model","Black");

			car1.display();
			car2.display();

			System.out.println("Car model is " +car1.getModel());
			System.out.println("Car color is "+car1.getColor());
			System.out.println("Car manufacturer is "+car1.getManufacturer());
			car1.accelerate(100);
			car1.applyBreak();
			car1.testDrive();
	 
		}
	 
	}