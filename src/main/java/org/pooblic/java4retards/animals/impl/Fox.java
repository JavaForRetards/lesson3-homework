package org.pooblic.java4retards.animals.impl;

import org.pooblic.java4retards.animals.Animal;
import org.pooblic.java4retards.animals.LegNumber;

public class Fox extends Animal {
	public Fox(String name, String subspecies, int age) {
		super(name, subspecies, age, LegNumber.QUADRUPED);
	}

	@Override
	public void printScientificName() {
		System.out.println("Vulpes vulpes");
	}
}
