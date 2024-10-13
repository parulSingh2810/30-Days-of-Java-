package com.accenture.com;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashMap hs = new HashMap<>();
          hs.put(1001,"Parul");
          hs.put(1002, "Nisarga");
          hs.put(1003, "Tanya");
          hs.put(1004, "Gagana");
          
          System.out.println(hs.isEmpty());;
          System.out.println(hs.containsKey(1001));
          System.out.println(hs.keySet());
          System.out.println(hs.get(1002));
          System.out.println(hs.keySet());
          hs.put(1005, "HAHA");
          System.out.println(hs.remove(1005));
          System.out.println(hs.size());
          System.out.println(hs.remove(null));
          
          
          
	}

}
