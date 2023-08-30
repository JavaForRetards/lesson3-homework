package org.pooblic.java4retards.animals.impl;

import org.pooblic.java4retards.animals.Animal;
import org.pooblic.java4retards.animals.ITalkative;
import org.pooblic.java4retards.animals.LegNumber;

public class Pigeon extends Animal implements ITalkative {
	public Pigeon(String name, int age) {
		super(name, age, LegNumber.BIPED);
	}

	@Override
	public void printScientificName() {
		System.out.println("Columba livia");
	}

	@Override
	public void makeSound() {
		System.out.println("coo!");
	}
}
