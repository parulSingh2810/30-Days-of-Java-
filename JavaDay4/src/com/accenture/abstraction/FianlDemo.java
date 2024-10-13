package com.accenture.abstraction;
// final class can't override
final class A{
	
	int a;
	int b;
	
	
}
class B {
	
	final int bb= 10;  // defining variable to final and making it constant
	int c;
	final void print() {
		System.out.println("final method can not overirde");
		
	}
	
}

public class FianlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.print();

	}

}
