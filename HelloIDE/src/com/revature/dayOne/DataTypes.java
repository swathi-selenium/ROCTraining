package com.revature.dayOne;

public class DataTypes {

	public static void main(String[] args) {
		
     byte myByte;//Declaration
     myByte=10;//Initialization
     byte mySecondaryByte=20;//declaration and initialization
     System.out.println("myByte: "+ myByte);
     System.out.println("mySecondaryByte: "+ mySecondaryByte);
     myByte=30;
     System.out.println("myByte: "+ myByte);
     
     short myShort =25_767;
     int myInt=1_000_000_567;//_ is for readability , we cannot use comma to seperate 
     long myLong=1234567889L;
     long mySecondLong=10000000;//implicitly casted from int to long
     
     //type sysout and ctrl+space as a shortcut
     System.out.println(myShort);
     System.out.println(myInt);
     System.out.println(myLong);
     System.out.println(mySecondLong);
     
     char c=1000;//technically also an integral type
     System.out.println(c);
     
     //Floating types
     float myFloat =3.1415F;
     double myDouble=31.454;
     System.out.println("myFloat: "+ myFloat);
     System.out.println("myDouble: "+ myDouble);
     
     //character type
     c='A';//char literals are enclosed by single quotes and double quotes
     System.out.println(c);
     
     //Boolean Type
     boolean b=true;
     System.out.println(b);
     b=false;//we need to declare a different variable name if we are declaring again:boolean b1=false;
     System.out.println(b);
     
	}

}
