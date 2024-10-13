package com.accenture.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmaticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int c =0;
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			c=  a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Exception");
			System.out.println(e.getMessage());
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
		}
		catch(InputMismatchException e) {
			System.out.println("Input mismatch exception");
			System.out.println(e.getMessage());
			
		}
		catch(Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}

	}

}
