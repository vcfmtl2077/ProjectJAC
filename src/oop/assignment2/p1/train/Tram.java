package oop.assignment2.p1.train;

import java.util.Objects;

import oop.assignment2.p1.metro.Metro;

public class Tram extends Metro {
	private int yearOfCreation;
	private static long serialNumberCounter = 30000;

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
		super(tr);
		this.yearOfCreation = tr.yearOfCreation;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}

	@Override
	public String toString() {
		return "This Tram- serial #" + this.getSerialNumber() + " - has " + this.getNumberOfWheels()
				+ " wheels, has a maximum speed of " + this.getMaximumSpeed() + " km/hr. It has "
				+ this.getNumberOfVehicles() + " vehicles, its starting and destination stations are "
				+ this.getStartingStation() + " and " + this.getDestinationStation() + ", it has "
				+ this.getTotalNumberOfStops() + " total stops." + "and its year of creation is "
				+ this.getYearOfCreation();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tram other = (Tram) obj;
		return Objects.equals(this.getDestinationStation(), other.getDestinationStation())
				&& this.getNumberOfVehicles() == other.getNumberOfVehicles()
				&& Objects.equals(this.getStartingStation(), other.getStartingStation())
				&& this.getMaximumSpeed() == other.getMaximumSpeed()
				&& this.getNumberOfWheels() == other.getNumberOfWheels()
				&& this.getTotalNumberOfStops() == other.getTotalNumberOfStops()
				&& this.yearOfCreation == other.yearOfCreation;
	}

}
