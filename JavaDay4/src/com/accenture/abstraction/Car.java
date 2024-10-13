package com.accenture.abstraction;
abstract class vehicle{
	abstract void drive1();

	public vehicle() {
		System.out.println("Constructor of vehicle class");
	}
	
}
class Bus extends vehicle{
	void drive1() {
		System.out.println("drive method defination");
		
	}
	public Bus() {
		System.out.println("Consructor of bus class");
	}
	
}


class Car extends vehicle{
	void drive1() {
		System.out.println("drive method defination");
		
	}
	public Car() {
		System.out.println("Consructor of bus class");
	}
	
}
