package com.accenture;


public class Array {
public static void main(String[] args) {
	System.out.println("********First way of creating an array*********");
	int [] arr = new int[10];
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	
	System.out.println("********Second way of creating an array*********");
	int [] arr1 = {2,4,5,6,6,3,2,23};
	for(int x:arr1) {
		System.out.println(x);
	}
	
	System.out.println("********Printing Friends name in an array*********");
	String [] names = {"Harshita","Nisarga","Gagana","Mahak","Bhumika","Akshita"};
	for(String p:names) {
		System.out.println(p);
	}
	
			}
}
