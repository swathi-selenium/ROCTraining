package com.revature.dayThree;

public class MathUtility_Debugger {
	

		public static boolean isPrime(int x) {
			
			if (x < 2) return false;
			
			for (int divisor = 2; divisor < x; divisor++) {
				if (x % divisor == 0) {
					return false;
				}
			}
			
			return true;
		}
		
	}


