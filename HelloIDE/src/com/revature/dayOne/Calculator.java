package com.revature.dayOne;

public class Calculator {
//classes are blueprints for objects
	//inside blue prints we can define 2 things:
	//1.State:Instance variable
	//2.Behavior:Methods
	//THis is an ex of an instance variable that will belong to an object in a heap
	
	
	
	public String name="TI-84";
	//there is no static keyword on this method,bcz this method belongs to an object of the calc class and not the calc class itself
	
	 public int add(int x,int y) {
	 return x+y;
	 }
	 public int subtract(int x,int y) {
		 return x-y;
		 }
	 
	 //below are static methods
	 
	// public static String name="TI-84";
	 public static int multiply(int x, int y) {
		 return x*y;
	 }
	 public static int divide(int x, int y) {
		 return x/y;
	 }
	 

}

//package com.revature.app;
//
//public class Calculator {
//	
////	public static void main(String[] args) {
////		System.out.println("Main method from Calculator class");
////		CalculatorMain.main(new String[0]);
////	}
//	
//	// Classes are blueprints for objects
//	// inside blueprints you can define 2 things:
//	// 1. state: instance variables
//	// 2. behavior: methods
//	
//	// This is an example of an instance variable that will belong to an object on the heap
//	public String name;
//	public int numOfButtons;
//	
//	/*
//	 * Below are instance methods
//	 */
//	
//	// There is no static keyword on this method, because this method belongs to an object of the Calculator class
//	// and not the Calculator class itself
//	public int add(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	// There is no static keyword on this method, because this method belongs to an object of the Calculator class
//	// and not the Calculator class itself
//	public int subtract(int x, int y) {
//		int result = x - y;
//		return result;
//	}
//	
//	/*
//	 * Below are static methods
//	 */
//	public static int multiply(int x, int y) {
//		return x * y;
//	}
//	
//	public static int divide(int x, int y) {
//		return x / y;
//	}
//}
//
