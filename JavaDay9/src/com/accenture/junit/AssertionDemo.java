package com.accenture.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionDemo {
	
	
	
	String s1 ="PArul";
	String s2 = "Nisarga";
	String[] a  = {"aa","b","cc"};
	String[] b  = {"aa","b","cc"};
	String[] c = {"aaaa","bbb","ccc"};
	int p =1;
	int q =2;
	
	
	

	
	public AssertionDemo() {
		System.out.println("This is constructor");
	}

  

	@Test
	public void Demo(){
		s2 = null;
//		Assertions.assertEquals(s1, s2);
//		Assertions.assertNotEquals(s1, s2);
//		Assertions.assertArrayEquals(b, a);
//		Assertions.assertNotEquals(a, b);
		Assertions.assertNull(s2);
//		Assertions.assertFalse(p<q);
//		Assertions.assertTrue(p<q);
//		Assertions.assertSame(s1, s2);
			 
		
	}
}
