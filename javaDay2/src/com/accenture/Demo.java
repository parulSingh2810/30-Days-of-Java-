package com.accenture;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 for Movies");
	System.out.println("Enter 2 for Shopping");
	System.out.println("Enter 3 for Eating Out");
	System.out.println("Enter 4 for No Plan");
	int x = sc.nextInt();
	switch(x) {
	case 1:
		System.out.println("Going for movies");
		break;
	case 2:
		System.out.println("Going for shopping");
		break;
	case 3:
		System.out.println("Going for Eating Out");
		break;
	case 4:
		System.out.println("No Plan");
		break;
	}
	
	}
}
