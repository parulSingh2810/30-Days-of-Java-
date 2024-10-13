package com.accenture.abstraction;

interface start{
	void draw();
}
class Oval implements start{
 
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn.");
	}
	void rotate() {
		System.out.println("Circle is rotated");
	}
}
class Triangle implements start{
 
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Trainagle is drawn");
	}
	void calculateperimeter() {
		System.out.println("Perimeter is calculated");
	}
}
public class TestShape {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oval c = new Oval();
		c.draw();
		c.rotate(); 
		Shape c1 = new Circle();
		c1.draw();
		//c1.rotate();
		start t = new Triangle();
		t.draw();
		//t.calculateperimeter();
	}
 
}
