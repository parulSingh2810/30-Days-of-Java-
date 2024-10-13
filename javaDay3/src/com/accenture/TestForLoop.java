package com.accenture;

import java.util.Scanner;

public class TestForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter count of element of an array");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String [] arr = new String [count];
		int i=0;
		do {
			arr[i] =sc.nextLine();
			i++;
		}
		while(i<count);
		for(String s: arr) {
			System.out.println(s);
		}
		
		
		

	}

}
