package com.accenture.abstraction;
interface Drawable{
	void draw();
	int i=90;
}
interface Rectangle{
	void Shape();
}

class Square implements Drawable, Rectangle{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing");
	}

	@Override
	public void Shape() {
		// TODO Auto-generated method stub
		System.out.println("Shaping");
		
	}
	
	
}
class demo implements Rectangle{

	@Override
	public void Shape() {
		// TODO Auto-generated method stub
		System.out.println("Nisarga");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Square();
		Rectangle r = new Square();
		Rectangle y = new demo();
		y.Shape();
		
		System.out.println(d.i);     // incorrect way
		System.out.println(Drawable.i);      // correct way
		d.draw();
		r.Shape();
		

	}

}
