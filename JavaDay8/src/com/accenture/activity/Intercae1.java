package com.accenture.activity;

	interface Vehicle{
		public static void applyBreak() {
			System.out.println("Apply break");
		}
		public default void testDrive() {
			System.out.println("in a default method of Vehicle");
		}
	}
	interface FourWheeler{
		public default void testDrive() {
			System.out.println("in a default method of four Wheeler");
		}
	}

	class Intercae1 implements Vehicle, FourWheeler{
		public void testDrive() {
			Vehicle.super.testDrive();
			FourWheeler.super.testDrive();
			System.out.println("in a Car class");
		}
		
	}
