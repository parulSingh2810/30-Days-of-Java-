package com.accenture.abstraction;
abstract class Shape{
	public abstract void draw();
	public abstract void erase();
}
class Circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw mwthod");
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Erase method");
		
	}
	
}

public class TestAbstract {
	public static void main(String [] args) {
		Circle obj = new Circle();
		obj.draw();
		obj.erase();
	}

}
