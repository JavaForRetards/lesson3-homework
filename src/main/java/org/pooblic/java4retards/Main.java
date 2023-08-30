package org.pooblic.java4retards;

import org.pooblic.java4retards.animals.Animal;
import org.pooblic.java4retards.animals.ITalkative;
import org.pooblic.java4retards.animals.impl.Cat;
import org.pooblic.java4retards.animals.impl.Dog;

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