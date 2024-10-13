package com.accenture.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer , String> hs = new HashMap<>();
         hs.put(1001,"Parul");
         hs.put(1002, "Nisarga");
         hs.put(1003, "Tanya");
         hs.put(1004, "Gagana");
         
         Set<Integer> keys= hs.keySet();
         Iterator<Integer> itr = keys.iterator()
;
         while(itr.hasNext()) {
        	 Integer key = itr.next();
        	 String value = hs.get(key);
        	 System.out.println(key + value);
        	 
        	 
         }
         
         

	}

}
