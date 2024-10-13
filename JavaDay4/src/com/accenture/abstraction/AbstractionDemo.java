package com.accenture.abstraction;

abstract class Animal{
	abstract void movement();
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	@Override
	void movement() {
		System.out.println("Dog is running");
	}
	
	
}
class Cat extends Animal{
	@Override
	void movement() {
		System.out.println("cat is running");
	}
	
}

public class AbstractionDemo
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		a.eat();
		a.movement();
		Animal c = new Cat(); 
		a.eat();
		c.movement();
			
		
	

	}

}
