package org.pooblic.java4retards.animals;

public abstract class Animal implements IScientificallyNameable {
	protected final String name;
	protected int age;
	protected final LegNumber legNumber;

	protected Animal(String name, int age, LegNumber legNumber) {
		this.name = name;
		this.age = age;
		this.legNumber = legNumber;
	}

	public void call() {
		System.out.printf("Come here, %s!\n", this.name);
	}

	public void ageUp() {
		this.age++;
	}

	public void printLegNumber() {
		this.legNumber.printLegNumber();
	}
}
