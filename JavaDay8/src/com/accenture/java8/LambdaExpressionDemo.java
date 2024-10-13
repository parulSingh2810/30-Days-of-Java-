package com.accenture.java8;

@FunctionalInterface
interface Lam{
	void run();
	 
}


public class LambdaExpressionDemo {
	public static void main (String[] args) {
		Lam v =()-> {
				System.out.println("HEHehehehhe");
				
			
		};
		v.run();		
	}

}
