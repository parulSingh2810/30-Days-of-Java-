package com.accenture.car;

public class Car {
	public String model;
	public String manufacturer;
	public String color;
	public void read_info(String model,String manufacturer,String color)
	{
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
	}
	public void display() {
		System.out.println("The car model is: "+model);
		System.out.println("The car color is: "+color);
		System.out.println("The car manufacturer is: "+manufacturer);
	}
	public void accelerate(int speed) {
		System.out.println("Accelerating to speed "+ speed);
	}
	public void applyBreak() {
		System.out.println("Applying break");
	}
	public void testDrive() {
		System.out.println("Going for test drive");
	}

 
}