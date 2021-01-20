package com.revature.dayOne;

public class CastingTypes {

	public static void main(String[] args) {
		/*implicit casting example
		widening conversion from int to long
		since integers can fit in long*/
		long myLong;//declaration only
		int myInt=1000;//declaration and initialization
		//initialization step
		myLong=myInt;//myInt is being implicitly casted from an int to  a long
        System.out.println(myLong);
        
        /*Explicit casting example:not safe to use it
         * Narrowing conversion from double to int
         */
        double myDouble=13.5;
        int myInt2;
        myInt2=(int) myDouble;
        System.out.println(myInt2);
        
        //Narrowing conversion
        long myLong2 =100;//implicit casting from integer literal to long
        myLong2=100000;
        byte myByte = (byte) myLong2;
        System.out.println(myByte);
        
        /*Reference type casting 
         * 1.Upcasting:from more specific to less specific
         * 2.Downcasting:from less specific to more specific
         * Strings in java are not primitives,they are objects
         * so we can assign a string object to a string reference variable
         * The reference variable does not contain the string object itself,instead it is an address to the object
         * 
         */
        String myStr = "Hello There!";
        //I am essentially creating a string object with an internal value of Hello There!(
        //an array of char values
        //myString is not storing the values "Hello There!", it is only storing an address to the object
        //unlike primitive data types,which do not store the value
         
        Object myObj=myStr;//implicit casting 
        
        //Downcasting is unsafe
        String myStr2=(String) myObj;
        System.out.println(myStr2);
        
//        //why unsafe?
//        myObj = new CastingTypes();
//        String myStr3=(String) myObj;//A string is an object ,therefore I can downcast
//        //But it is unsafe,because myObj is not necessarily pointing to a String object
//        System.out.println(myStr3);	
//        
	}

}
