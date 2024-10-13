package com.accenture.AIC;

public class AnonymousInnerClassDemo {
	public static void main(String [] args) {
		Greeting g = new Greeting() {
			
			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("My name is "+ name);
				
			}
		};
		g.greet("Parul");
	}
}
