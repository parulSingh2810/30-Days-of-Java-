package com.accenture.junit;
 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 

public class AnnotationDemo {

	//initialization
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before all the test cases");
	}
	// closure statements
	@AfterAll
	public static void afterAll() {
		System.out.println("After all the test cases");
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("--------Before each test case---------");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("--------After each test case----------");
	}
	@Test
	@DisplayName("Unit Test 1")
	public void testCase1() {
		Assertions.assertEquals(2, 2);
		System.out.println("This is test case 1");
	}
	@Test
	//@DisplayName("Unit Test 1")
	public void testCase2() {
		Assertions.assertEquals(2, 2);
		System.out.println("This is test case 2");
	}
	@Test
	@Disabled
	//@DisplayName("Unit Test 1")
	public void testCase3() {
		Assertions.assertEquals(2, 2);
		System.out.println("This is test case 3");
	}
}


//package com.accenture.junit;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestClassOrder;
//
//public class AnnotationDemo {
//	
////	@Test
//	@BeforeAll
//	public static void testDemo1() {
//		System.out.println("this is test case before all");
//		Assertions.assertEquals(2, 2);
//	}
//
////	@Test
//	@AfterAll
//	public static void testDemo2() {
//		System.out.println("this is test case after all");
//		Assertions.assertEquals(2, 2);
//		
//	}
//
//	@Test
//	@BeforeEach
//	public void testDemo3() {
//		System.out.println("this is test case before each");
//		Assertions.assertEquals(2, 2);
//	}
//
//	@Test
//	@AfterEach
//	public void testDemo4() {
//		Assertions.assertEquals(2, 2);
//		System.out.println("this is test case after each");
//	}
//
//	@Test
//	@DisplayName("My name is Parul. What is your name? hehehehehehe")
//	@Disabled
//	public void testDemo8() {
//		System.out.println("this is test case disabled");
//	}
//	
//	
//	
//	
//}
