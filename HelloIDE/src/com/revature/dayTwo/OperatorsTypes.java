package com.revature.dayTwo;

import java.util.ArrayList;
import java.util.List;

public class OperatorsTypes {

	public static void main(String[] args) {
		// look into the concept of numerical promotion with arithmetic operators
		// negative number
		int x = -100;
		// positive number
		int y = 10;// y= +10; + is optional
		// prefix and postfix increment and decrement
		// prefix increment which wll evaluate the result of adding 1 first
		System.out.println(++x);// -99
		// what is the value of x her? Is it -99 or -98
		System.out.println(x);
		//// postfix increment will evaluate the pre-existing value before adding 1
		System.out.println(x++);// -99
		// what is the value of x her? Is it -99 or -98
		System.out.println(x);

		// prefix decrement
		System.out.println(--y);
		System.out.println(y);

		// prefix decrement
		System.out.println(y--);
		System.out.println(y);

		// Binary arithmetic operators
		// addition
		int mySum = x + 26;
		System.out.println(mySum);

		// subtraction
		int myDiff = x + 26;
		System.out.println(myDiff);

		// multiplication
		int myProd = mySum * myDiff;
		System.out.println(myProd);

		// division
		int num1 = 16;
		int num2 = 6;
		double myQuotient = num1 / num2;
		System.out.println(myQuotient);
		// after evaluate to the integer ,we are also having implicit widening
		// conversion from int to double

		myQuotient = 2 / 9;
		System.out.println(myQuotient);

		myQuotient = 2.0 / 9.;// double /int
		System.out.println(myQuotient);
		// so the 9 int literal is being promoted to double ,bcz 2.0 is double literal
		// this is same as above
		myQuotient = 2.0 / 9.0;
		System.out.println(myQuotient);

		myQuotient = 2. / 9;
		System.out.println(myQuotient);

		byte a = 10;
		byte b = 20;
		// byte c= a+b;//this doesnot work as for primitive variables being added
		// together of a size smaller than int ,they will automatically be promoted to
		// an int fo rbinary operators
		byte c = (byte) (a + b);
		System.out.println("c: " + c);

		// modulus-number which is exactly divided by the denominator has remainder zero
		int myRemainder = 15 % 6;
		System.out.println(myRemainder);

		myRemainder = 15 % 2;
		System.out.println(myRemainder);

		myRemainder = 14 % 2;
		System.out.println(myRemainder);

		myRemainder = (int) 16.0 % 2;
		System.out.println(myRemainder);

		// Numeric promotion
		byte myByte;
		byte myByte1 = 10;
		byte myByte2 = 11;
		myByte = (byte) (myByte1 + myByte2);
		System.out.println(myByte);

		double myOtherDouble = 10.53 + 1;// 1 willl be promoted to a double
		System.out.println(myOtherDouble);

		// Assignment operators

		// simple
		int z = 54;
		// plus equals
		z += 5;
		System.out.println("z: " + z);

		// minus equals
		z -= 5;
		System.out.println("z: " + z);

		// multiply equals
		z *= 5;
		System.out.println("z: " + z);

		// divide equals
		z /= 5;
		System.out.println("z: " + z);

		// modulus equals
		z %= 5;
		System.out.println("z: " + z);

		// Logical Operators
		boolean value1 = true;
		boolean value2 = false;
		boolean value3 = true;
		boolean value4 = false;

		// AND
		boolean result = value1 && value2;// true&&false=false
		System.out.println("result: " + result);

		result = value1 && value3;// true&&true=true
		System.out.println("result: " + result);

		// or
		result = value1 || value2;// true || false=true
		System.out.println("result: " + result);

		result = value4 || value2;// false || false=false
		System.out.println("result: " + result);

		// short circuit in action
		// && action
		result = getFalse() && getTrue();// false && false =false
		System.out.println(result);

		result = getTrue() && getFalse();// true && true =true
		System.out.println(result);

		result = getFalse() & getTrue();
		System.out.println(result);

		// || action
		result = getFalse() || getTrue();// false && true =true
		System.out.println(result);

		result = getTrue() || getFalse();// false && true =true
		System.out.println(result);

		result = getFalse() | getTrue();
		System.out.println(result);

		// Relational operators

		int a1 = 0;
		int b1 = 2;
		int c1 = 4;
		int d1 = 6;
		String myStr = "Hello";

		Object myArrayList = new ArrayList<String>();
		// Equal to
		System.out.println("-------------");
		System.out.println("== :" + (c1 == d1));

		// Not Equal to
		System.out.println("-------------");
		System.out.println("!= :" + (c1 != d1));

		// greater than
		System.out.println("-------------");
		System.out.println(" > :" + (c1 > d1));

		// greater than Equal to
		System.out.println("-------------");
		System.out.println(">= :" + (c1 >= d1));

		// less than to
		System.out.println("-------------");
		System.out.println("< :" + (c1 < d1));

		// less than Equal to
		System.out.println("-------------");
		System.out.println("<= :" + (c1 <= d1));

		// instanceOf
		System.out.println("myStr is a String: " + myStr instanceof String);
		System.out.println("myStr is an object: " + myStr instanceof Object);
		System.out.println("myArrayList is an object: " + (myArrayList instanceof Object));
		System.out.println("myArrayList is a String: " + (myArrayList instanceof String));
		System.out.println("myArrayList is a List: " + (myArrayList instanceof List));

		//Test:System.out.println(0.1+0.2);
	}

	public static boolean getTrue() {
		System.out.println("getTrue() invoked");
		return true;
	}

	public static boolean getFalse() {
		System.out.println("getFalse() invoked");
		return true;
	}

}

//package com.revature.demo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class OperatorDriver {
//
//	public static void main(String[] args) {
//		
//		// negative number
//		int x = -100;
//		// positive number
//		int y = +10; // the + is optional
//
//		/*
//		 * prefix and postfix increment/decrement
//		 */
//		// Prefix increment, which will evaluate the result of adding 1 first
//		System.out.println(++x); // -99
//		// Postfix increment will evaluate the pre-existing value before adding 1
//		System.out.println(x++); // -99
//		
//		// What is the value of x here? is it -99? or -98?
//		System.out.println(x); // -98!
//		
//		// prefix decrement
//		System.out.println(--y); // 9
//		
//		// postfix decrement
//		System.out.println(y--); // 9
//		
//		System.out.println(y); // 8
//		
//		/*
//		 * Binary arithmetic operators
//		 */
//		
//		// addition
//		int mySum = x + 26;
//		System.out.println(mySum);
//		
//		// subtraction
//		int myDifference = mySum - y;
//		System.out.println(myDifference);
//		
//		// multiplication
//		int myProduct = mySum * myDifference;
//		System.out.println(myProduct);
//		
//		// division
//		int num1 = 16;
//		int num2 = 6;
//		double myQuotient = num1 / num2; // because num1 is int and num2 is also int, we're basically dividing
//		// an int by an int, and therefore our result is an integer
//		// After we evaluate to the int, we are also having an implicit widening conversion from int to double
//		// which gets us that 2.0
//		// But we already lost the information about the decimal
//		System.out.println(myQuotient);
//		
//		myQuotient = 2 / 9;
//		System.out.println(myQuotient);
//		
//		myQuotient = 2.0 / 9; // Here we're doing double divided by int
//		// What happens when you use binary operators such as division is that the narrower primitive will be 
//		// automatically promoted to the largest primitive
//		// So the 9 int literal is being promoted to a double, because 2.0 is a double literal
//		System.out.println(myQuotient);
//		// This is the same as
//		myQuotient = 2.0 / 9.0; 
//		
//		myQuotient = 2. / 9;
//		System.out.println(myQuotient);
//		
//		
//		// Modulus
//		int myRemainder = 15 % 6;
//		System.out.println(myRemainder);
//		
//		// Even numbers have a remainder of 0, and odd have a remainder of 1 if we are doing mod 2
//		myRemainder = 15 % 2;
//		System.out.println(myRemainder);
//		
//		myRemainder = 14 % 2;
//		System.out.println(myRemainder);
//		
//		myRemainder = (int) 16.0 % 2; 
//		
//		/*
//		 * Numeric promotion
//		 * This is the idea for binary operators such as addition, subtraction, multiplication, division, that
//		 * the primitive variables will be promoted to the highest level operand. If all operands are of
//		 * lower level than int, they will all be promoted to int. This leads to some interesting cases
//		 */
//		byte myByte;
//		byte myByte1 = 10;
//		byte myByte2 = 11;
//		myByte = (byte) (myByte1 + myByte2);
//		System.out.println(myByte);
//		
//		double myOtherDouble = 10.53 + 1; // 1 will get promoted up to a double
//		System.out.println(myOtherDouble);
//		
//		/*
//		 * Assignment operators
//		 */
//		
//		// simple assignment
//		int z = 54;
//		
//		// plus-equals
//		z += 5; // z = z + 5
//		System.out.println("z = " + z);
//		
//		// minus-equals
//		z -= 20; // z = z - 20
//		System.out.println("z = " + z);
//		
//		// multiply-equals
//		z *= 5; // same as z = z * 5;
//		System.out.println("z = " + z);
//		
//		// divide-equals
//		z /= 5; // z = z / 5
//		System.out.println("z = " + z);
//		
//		// mod-equals
//		z %= 2; // z = z % 2
//		System.out.println("z = " + z);
//		
//		/*
//		 * Logical operators
//		 */
//		boolean value1 = true;
//		boolean value2 = false;
//		boolean value3 = true;
//		boolean value4 = false;
//		
//		// AND (true && false)
//		boolean result = value1 && value2; // true && false -> false
//		System.out.println("true && false: " + result);
//		
//		// AND (true && true)
//		result = value1 && value3; // true && true -> true
//		System.out.println("true && true: " + result);
//
//		// OR (true || false)
//		result = value1 || value2; // true || false -> true
//		System.out.println("true || false: " + result);
//		
//		// OR (false || false)
//		result = value2 || value4; // false || false -> false
//		System.out.println("false || false: " + result);
//		
//		// OR (true || true)
//		result = value1 || value3; // true || true -> true
//		System.out.println("true || true: " + result);
//		
//		// Short circuiting in action
//		// & or | can be used as logical operators as well, not just bitwise operators
//		// They differ from && and || by the idea of short-circuiting
//		// AND
//		
//		// && short-circuits
//		result = getFalse() && getTrue(); // false && true -> false
//		System.out.println(result);
//		result = getTrue() && getFalse();
//		System.out.println(result);
//		
//		result = getFalse() & getTrue();
//		System.out.println(result);
//		
//		// || short-circuits
//		result = getTrue() || getFalse(); // true || false -> true
//		System.out.println(result);
//		
//		result = getTrue() | getFalse(); // true | false -> true
//		System.out.println(result);
//		
//		/*
//		 * Relational Operators
//		 */
//		int a = 0;
//		int b = 1;
//		int c = 2;
//		int d = 2;
//		String myStr = "hello";
//		Object myArrayList = new ArrayList<String>();
//		
//		// Equal to
//		System.out.println("-------");
//		System.out.println(" == : " + (c == d));
//		
//		// Not Equal to
//		System.out.println("-------");
//		System.out.println(" != : " + (c != d));
//		
//		// Greater than
//		System.out.println("-------");
//		System.out.println(" > : " + (b > a));
//		
//		// Less than
//		System.out.println("-------");
//		System.out.println(" < : " + (c < d));
//		
//		// Less than or equal to
//		System.out.println("-------");
//		System.out.println(" <= : " + (c <= d));
//		
//		// Greater than or equal to
//		System.out.println("-------");
//		System.out.println(" >= : " + (d >= a));
//		
//		// instanceof
//		System.out.println(" myStr is a String: " + (myStr instanceof String));
//		System.out.println(" myStr is an Object: " + (myStr instanceof Object));
//		System.out.println(" myArrayList is an Object: " + (myArrayList instanceof Object));
//		System.out.println(" myArrayList is an String: " + (myArrayList instanceof String));
//		System.out.println(" myArrayList is a List: " + (myArrayList instanceof List));
//		
//	}
//	
//	public static boolean getTrue() {
//		System.out.println("getTrue() invoked");
//		return true;
//	}
//	
//	public static boolean getFalse() {
//		System.out.println("getFalse() invoked");
//		return false;
//	}
//
//}
//
