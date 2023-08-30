package org.example;

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