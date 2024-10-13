package com.accenture;

//import javax.sound.midi.Soundbank;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="hello";
		String s2 = "hello";
		String s3 = new String("HELLO");
		String s4 = new String("HELLO");
		String s5 ="Goooood morning Nisarga";
		String s6 = "Good morning parul";
		System.out.println("Equal method for s1 and s2 "+s1.equals(s1));
		System.out.println("Equals Ignorecase for s1 and s2 "+s1.equalsIgnoreCase(s2));
		System.out.println("Finding size"+s1.length());
		System.out.println("Printing index of e in s1: " + (s1.indexOf('e')));
		System.out.println("Printing last index"+s1.lastIndexOf('l'));
		System.out.println("Content equals method " +s1.contentEquals(s2));
		System.out.println("Concate method " +s1.concat(s4));
		System.out.println("Substring method " +s1.substring(4));
		System.out.println("Substring method " +s1.substring(1,3));
		System.out.println("toLower method " +s1.toLowerCase());
		System.out.println("toUpper method " +s1.toUpperCase());
		System.out.println(("== operator ") +(s1==s2));
		System.out.println(("== operator ") +(s3==s4));
		
		String s7  [] = s6.split(" ");
		for(String k : s7) {
			System.out.println(k);
		}
		
	
	

	}

}
