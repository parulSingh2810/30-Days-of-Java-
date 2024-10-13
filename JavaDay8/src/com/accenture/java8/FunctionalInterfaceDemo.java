package com.accenture.java8;

@FunctionalInterface
interface Vehicl{
	void run();
	 
}


public class FunctionalInterfaceDemo {
	public static void main (String[] args) {
		Vehicl v = new Vehicl() {
			
			@Override
			public void run() {
				System.out.println("HEHehehehhe");
				
			}
		};
		
		
	}

}
