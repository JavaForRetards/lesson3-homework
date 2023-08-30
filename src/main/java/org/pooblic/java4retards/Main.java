package org.pooblic.java4retards;

import org.pooblic.java4retards.animals.Animal;
import org.pooblic.java4retards.animals.ITalkative;
import org.pooblic.java4retards.animals.impl.*;

public class Main {
	public static void main(String[] args) {
		Animal[] arr = new Animal[3];
		arr[0] = new Fox("Fox's name", "Vulpes vulpes ichnusae", 3);
		arr[1] = new Snake("Snake's name", "Python molorus pimbura", 2);
		arr[2] = new Pigeon("Pigeon's name", "Columba livia livia", 1);

		for(Animal a : arr) {
			a.printScientificName();
			a.printBiologicalKingdom();
			a.call();
			if(a instanceof ITalkative) {
				ITalkative t = (ITalkative) a;
				t.makeSound();
			}
		}
	}
}