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

	public Tram(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String startingStation,
			String destinationStation, int totalNumberOfStops, int yearOfCreation) {
		super(numberOfWheels, maximumSpeed, numberOfVehicles, startingStation, destinationStation, totalNumberOfStops);
		this.yearOfCreation = yearOfCreation;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public Tram(Tram tr) {
		super();
		this.yearOfCreation = tr.yearOfCreation;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

}
