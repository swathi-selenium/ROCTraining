package com.revature.dayThree;
import com.revature.dayThree.Shoppers_Model;
public class Shoppers_App {
	
	//should be in different packages-Shoppers_Model and Shoppers_App
	

		public static void main(String[] args) {
			
			// declaring a reference variable of the type Shopper
			Shoppers_Model bob;
			bob = new Shoppers_Model();
			
			
			bob.name = "Bob";
			bob.setPurchaseTotal(50.67);
			
			bob.calculateTax();
			
			bob.printDetails();
			
			Shoppers_Model bill = new Shoppers_Model();

		}

	}

