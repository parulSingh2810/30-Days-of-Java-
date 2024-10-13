package com.accenture.com;

import java.util.HashMap;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer , String> hs = new HashMap<>();
         hs.put(1001,"Parul");
         hs.put(1002, "Nisarga");
         hs.put(1003, "Tanya");
         hs.put(1004, "Gagana");
         
         hs.forEach((x,y)-> System.out.println("Key  is "+ x+ " " + "value is "+ y));
	}

}
