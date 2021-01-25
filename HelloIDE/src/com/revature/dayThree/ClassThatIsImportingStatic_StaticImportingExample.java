package com.revature.dayThree;
import static com.revature.dayThree.MathUtility_StaticImportExample.*;
public class ClassThatIsImportingStatic_StaticImportingExample {
	

	
	//should be in different packages-MathUtility_StaticImportExample and ClassThatImportingStatic_StaticImportingExample
	

		public static void main(String[] args) {
			// Instead of referencing the ClassName.<static method/variable>
			// I can now access them directly
			System.out.println(PI);
			System.out.println(add(10, 20));
		}
		
	}


