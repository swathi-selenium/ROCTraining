package day2.oops.concepts;

import day2.oops.concepts.InheritanceDog;


public class InheritanceDriver {

	public static void main(String[] args) {

		InheritanceDog dog = new InheritanceDog("Fido"); // Dog() is a constructor that basically instantiates a Dog
															// object
		dog.numOfLegs = 4; // numOfLegs is defined in the Animal class, but Dog inherits from Animal, so it
							// has this property as well

		InheritanceDog dog2 = new InheritanceDog("Sparky");
		dog2.numOfLegs = 3;

		InheritanceDog[] dogs = new InheritanceDog[] { dog, dog2 };

		dog.makeNoises();
		System.out.println(dog2.numOfLegs);
		System.out.println(dog.numOfLegs);

		dog.playFetch();
		dog2.playFetch();

		Object myObj = dog; // These all refer to the same dog
		InheritanceAnimal myAnimal = dog; // They are not 3 separate dogs
		InheritanceDog myDog = dog;
	}

}
