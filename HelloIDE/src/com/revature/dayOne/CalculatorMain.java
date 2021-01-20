package com.revature.dayOne;

public class CalculatorMain {

	public static void main(String[] args) {
		//here i instantiate a calculator object and the address to that object 
		Calculator calculator=new Calculator();
		//objects have state and behavior which i can utilize
		System.out.println(calculator.name);
		System.out.println(calculator.add(10,20));
		System.out.println(calculator.subtract(40,30));
		
   
	}

}
