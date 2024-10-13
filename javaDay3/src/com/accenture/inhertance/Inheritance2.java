package com.accenture.inhertance;

 class calc{
	public int add(int a, int b) {
		return a+b;
	}
	
}
 class advancedCalc extends calc{
	public int sub(int a,int b) {
		return a-b;
	}
}
 class veryAdvacedcalc extends advancedCalc{
	public int mul (int a, int b) {
		return a*b;
	}
}

public class Inheritance2 {

public static void main(String [] args) {
	veryAdvacedcalc c = new veryAdvacedcalc();
	System.out.println(c.mul(14,2));
	
}

}
