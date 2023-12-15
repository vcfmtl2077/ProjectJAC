package oop.assignment2.p1.metro;

import java.util.Objects;

import oop.assignment2.p1.train.Train;

public class Metro extends Train {
	private int totalNumberOfStops;
	private static long serialNumberCounter = 25000;

	public int getTotalNumberOfStops() {
		return totalNumberOfStops;
	}

	public void setTotalNumberOfStops(int totalNumberOfStops) {
		this.totalNumberOfStops = totalNumberOfStops;
	}

	public Metro() {
		super();
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public Metro(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String startingStation,
			String destinationStation, int totalNumberOfStops) {
		super(numberOfWheels, maximumSpeed, numberOfVehicles, startingStation, destinationStation);
		this.totalNumberOfStops = totalNumberOfStops;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public Metro(Metro mt) {
		super(mt);
		this.totalNumberOfStops = mt.totalNumberOfStops;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}

	@Override
	public String toString() {
		return "This Metro- serial #" + this.getSerialNumber() + " - has " + this.getNumberOfWheels()
				+ " wheels, has a maximum speed of " + this.getMaximumSpeed() + " km/hr. It has "
				+ this.getNumberOfVehicles() + " vehicles, its starting and destination stations are "
				+ this.getStartingStation() + " and " + this.getDestinationStation() + " and it has "
				+ this.getTotalNumberOfStops() + " total stops.";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metro other = (Metro) obj;
		return Objects.equals(this.getDestinationStation(), other.getDestinationStation())
				&& this.getNumberOfVehicles() == other.getNumberOfVehicles()
				&& Objects.equals(this.getStartingStation(), other.getStartingStation())
				&& Double.doubleToLongBits(this.getMaximumSpeed()) == Double.doubleToLongBits(other.getMaximumSpeed())
				&& this.getNumberOfWheels() == other.getNumberOfWheels()
				&& this.totalNumberOfStops == other.totalNumberOfStops;
	}

}
