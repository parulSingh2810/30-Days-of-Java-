package com.accenture;

public class BuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("Hello");
		s1.append("world");
		
		StringBuilder s2 = new StringBuilder("Hello");
		s2.append("world");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
