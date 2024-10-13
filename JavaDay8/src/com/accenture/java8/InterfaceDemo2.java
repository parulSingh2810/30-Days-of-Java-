package com.accenture.java8;
interface A{
	public default void display() {
		System.out.println("method in A");
	}
}
interface B{
	public default void display() {
		System.out.println("method in B");
	}
	
}
class C implements A,B{
	public void display() {
		A.super.display();
		System.out.println("method in c");
	}
	
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
	C c = new C();
	c.display();
	}
	

}
