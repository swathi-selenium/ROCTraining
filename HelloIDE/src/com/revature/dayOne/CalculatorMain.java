package com.revature.dayOne;

public class CalculatorMain {

	public static void main(String[] args) {
		
		//here i instantiate a calculator object and the address to that object 
		Calculator myCalculator=new Calculator();
		myCalculator.name="Name1";
		
		//we can use this for the above line of code Calculator.name="Name1";
		//objects have state and behavior which i can utilize
		System.out.println(myCalculator.name);
		System.out.println(myCalculator.add(10,20));
		System.out.println(myCalculator.subtract(40,30));
		//bcz multiply and divide are static ,I can access them directly from the class itself
		
		System.out.println(Calculator.multiply(40,30));
		System.out.println(Calculator.divide(40,20));
		
        Calculator myCalculator2=new Calculator();
        System.out.println(myCalculator2.name);
	}

}

//package com.revature.app;
//
//public class CalculatorMain {
//
//	public static void main(String[] args) {
//		// Here I instantiate a Calculator object and the address to that object is stored in the calculator variable
//		Calculator myCalculator = new Calculator();	
//		myCalculator.name = "Name 1";
//
//		// Objects have state and behavior, which I can utilize
//		System.out.println(myCalculator.name);
//		
//		System.out.println(myCalculator.add(10, 20));
//		System.out.println(myCalculator.subtract(20, 10));
//		
//		// Because multiply and divide are static, I can access them directly from the class itself
//		System.out.println(Calculator.multiply(2, 3));
//		System.out.println(Calculator.divide(4, 2));
//		
//		Calculator myCalculator2 = new Calculator();
//		myCalculator2.name = "Name 2";
//		System.out.println(myCalculator2.name);
//		
//		Object myObj = myCalculator;
//		System.out.println(myObj instanceof Calculator);
//		System.out.println(myObj instanceof String);
//		
//		System.out.println("===========");
//		System.out.println(myCalculator.name);
//		System.out.println(myCalculator2.name);
//		System.out.println(myCalculator.name);
//		System.out.println(myCalculator.numOfButtons);
//	}
//
//}
//
