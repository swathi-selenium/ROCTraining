package com.revature.dayThree;

import com.revature.oops.concepts.Person_Model_Encapsulation;

public class Application_Main_Encapsulation {

	public static void main(String[] args) {
		Person_Model_Encapsulation bill = new Person_Model_Encapsulation("Bill", 18, "Student");

		System.out.println("name: " + bill.getName());
		System.out.println("age: " + bill.getAge());
		System.out.println("occupation: " + bill.getOccupation());

		bill.setName("william");
		System.out.println(bill.getName());
	}

}