package org.pooblic.java4retards.animals.impl;

import org.pooblic.java4retards.animals.ITalkative;
import org.pooblic.java4retards.animals.LegNumber;
import org.pooblic.java4retards.animals.Animal;

public class Cat extends Animal implements ITalkative {
	public Cat(String name, int age) {
		super(name, age, LegNumber.QUADRUPED); //cats are all quadrupeds
	}

	@Override
	public void makeSound() {
		System.out.println("meow!");
	}

	@Override
	public void printScientificName() {
		System.out.println("Felis catus");
	}
}