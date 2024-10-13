package com.accenture;

import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a>b && a>c) {
		System.out.println("A is the greatest number that is = "+a);
	}
	else if(b>a && b>c) {
		System.out.println("B is the greatest number that is = "+b);
	}
	else {
		System.out.println("C is the greatest number that is  = "+c);
	}
	sc.close();

}

}

