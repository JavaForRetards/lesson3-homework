package org.pooblic.java4retards.animals.impl;

import org.pooblic.java4retards.animals.Animal;
import org.pooblic.java4retards.animals.ITalkative;
import org.pooblic.java4retards.animals.LegNumber;

public class Snake extends Animal implements ITalkative {

	public Snake(String name, int age) {
		super(name, age, LegNumber.NONE);
	}

	@Override
	public void printScientificName() {
		System.out.println("Python molurus"); //Indian python
	}

	@Override
	public void makeSound() {
		System.out.println("hisss!");
	}
}
