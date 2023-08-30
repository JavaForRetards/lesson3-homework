package org.pooblic.java4retards.animals;

public abstract class Animal implements IScientificallyNameable {
	protected final String name;
	protected final String subspecies;
	protected int age;
	protected final LegNumber legNumber;

	protected Animal(String name, String subspecies, int age, LegNumber legNumber) {
		this.name = name;
		this.subspecies = subspecies;
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

	public void printSubspecies() {
		System.out.printf("Subspecies: %s\n", this.subspecies);
	}

	@Override
	public void printBiologicalKingdom() {
		System.out.println("Animalia");
	}
}
