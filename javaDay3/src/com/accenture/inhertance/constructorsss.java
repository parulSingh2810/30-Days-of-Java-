package com.accenture.inhertance;
 
 
	class A{
		A(){
			System.out.println("No argument constructor == parent class");
		}
		A(int a){
			System.out.println("argument constructor == parent class");
		}
	}
	class B extends A{
		B(){
			super(4);
			System.out.println("No argument constructor == Child class");
		}
		B(int a){
			System.out.println("argument constructor == child class");
		}
	}
	public class constructorsss {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		B o = new B();

	}
 
}

