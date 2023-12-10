package oop.assignment2.p1.train;

import oop.assignment2.p1.metro.Metro;

public class Tram extends Metro {
	private int yearOfCreation;
	private static int serialNumberCounter = 30000;
	public int getYearOfCreation() {
		return yearOfCreation;
	}
	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}
	public Tram() {
		super();
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

}
