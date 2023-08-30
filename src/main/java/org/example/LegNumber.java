package org.example;

public enum LegNumber {
	BIPED(2, "two"),
	QUADRUPED(4, "four");

	private final int legNumber;
	private final String legNumberName;

	LegNumber(int legNumber, String legNumberName) {
		this.legNumber = legNumber;
		this.legNumberName = legNumberName;
	}

	public int getLegNumber() {
		return this.legNumber;
	}

	public void printLegNumber() {
		System.out.printf("This animal has %s legs!", this.legNumberName);
	}
}