package org.example;

public class Dog extends Animal implements ITalkative {
	public Dog(String name, int age) {
		super(name, age, LegNumber.QUADRUPED);
	}

	@Override
	public void makeSound() {
		System.out.println("woof!");
	}

	@Override
	public void printScientificName() {
		System.out.println("Canis familiaris");
	}
}