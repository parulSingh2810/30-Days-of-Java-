package com.accenture.constructor;
	
	public class Car {

		public String model;

		public String manufacturer;

		public String color;
		
//		For reading information
		

		public void read_info(String model,String manufacturer,String color)

		{

			this.model = model;

			this.color = color;

			this.manufacturer = manufacturer;

		}
//		For display
		public void display() {

			System.out.println("The car model is: "+model);

			System.out.println("The car color is: "+color);

			System.out.println("The car manufacturer is: "+manufacturer);

		}
//		Constructor
		Car() {

			model="AMG S 63";

			color = "Blue";

			manufacturer = "Mercedes";	

		}
//		PArameterized Constructor

		Car(String model,String manufacturer,String color) {

			this.model=model;

			this.manufacturer=manufacturer;

			this.color = color;

		}
        
		
//		Getters and setters
		public String getModel() {

			return model;

		}
	 
		public void setModel(String model) {

			this.model = model;

		}
	 
		public String getManufacturer() {

			return manufacturer;

		}
	 
		public void setManufacturer(String manufacturer) {

			this.manufacturer = manufacturer;

		}
	 
		public String getColor() {

			return color;

		}
	 
		public void setColor(String color) {

			this.color = color;

		}
//		For accelerating
	    
		public void accelerate(int speed) {

			System.out.println("Accelerating to speed "+ speed);

		}
		
//		For applying break

		public void applyBreak() {

			System.out.println("Applying break");

		}

		public void testDrive() {

			System.out.println("Going for test drive");

		}

	 
	}

	 