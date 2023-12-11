package oop.assignment2.p1.train;

import java.util.Objects;

import oop.assignment2.p1.transportation.WheeledTransportation;

public class Train extends WheeledTransportation {
	private int numberOfVehicles;
	private String startingStation;
	private String destinationStation;
	private static long serialNumberCounter = 10000;

	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicles(int numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}

	public String getStartingStation() {
		return startingStation;
	}

	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Train() {
		super();
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public Train(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String startingStation,
			String destinationStation) {
		super(numberOfWheels, maximumSpeed);
		this.numberOfVehicles = numberOfVehicles;
		this.startingStation = startingStation;
		this.destinationStation = destinationStation;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public Train(Train tr) {
		super(tr);
		this.destinationStation = tr.destinationStation;
		this.numberOfVehicles = tr.numberOfVehicles;
		this.startingStation = tr.startingStation;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}

	@Override
	public String toString() {
		return "This Train- serial #" + this.getSerialNumber() + " - has " + this.getNumberOfWheels()
				+ " wheels, has a maximum speed of " + this.getMaximumSpeed() + " km/hr. It has "
				+ this.getNumberOfVehicles() + " vehicles and its starting and destination stations are "
				+ this.getStartingStation() + " and " + this.getDestinationStation();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		double i = this.getMaximumSpeed();
		double j = other.getMaximumSpeed();
		
		return Objects.equals(this.getDestinationStation(), other.getDestinationStation())
				&& this.getNumberOfVehicles() == other.getNumberOfVehicles()
				&& Objects.equals(this.getStartingStation(), other.getStartingStation())
				&& this.getMaximumSpeed() == other.getMaximumSpeed()
				&& this.getNumberOfWheels() == other.getNumberOfWheels();
	}

}
