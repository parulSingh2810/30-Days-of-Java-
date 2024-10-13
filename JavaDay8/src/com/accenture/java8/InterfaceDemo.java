package com.accenture.java8;

interface Vehicle{
	void run();
	public default void start() {
		System.out.println("Car is running");
	}
}
class car implements Vehicle{
	
	
	public void start() {
		
		System.out.println("Car is running in car ");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceDemo {
	public static void main (String[] args) {
		Vehicle v = new car();
		v.start();
		
	}

}
