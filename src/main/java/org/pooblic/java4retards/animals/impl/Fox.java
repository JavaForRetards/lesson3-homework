package org.pooblic.java4retards.animals.impl;

import org.pooblic.java4retards.animals.Animal;
import org.pooblic.java4retards.animals.LegNumber;

public class Fox extends Animal {
	public Fox(String name, int age) {
		super(name, age, LegNumber.QUADRUPED);
	}

	@Override
	public void printScientificName() {
		System.out.println("Vulpes vulpes");
	}
}
