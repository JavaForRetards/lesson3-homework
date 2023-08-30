package org.pooblic.java4retards.animals.impl;

import org.pooblic.java4retards.animals.Animal;
import org.pooblic.java4retards.animals.LegNumber;

public class Pigeon extends Animal {
	protected Pigeon(String name, int age) {
		super(name, age, LegNumber.BIPED);
	}

	@Override
	public void printScientificName() {
		System.out.println("Columba livia");
	}
}
