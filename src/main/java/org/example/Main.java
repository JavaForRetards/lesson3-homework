package org.example;

public class Main {
	public static void main(String[] args) {
		Animal[] arr = new Animal[3];
		arr[0] = new Cat("Mr. Whiskers", 5);
		arr[1] = new Cat("Fluffles", 3);
		arr[2] = new Dog("Buster", 3);

		for(Animal a : arr) {
			a.printScientificName();
			a.call();
			if(a instanceof ITalkative) {
				ITalkative t = (ITalkative) a;
				t.makeSound();
			}
		}
	}
}