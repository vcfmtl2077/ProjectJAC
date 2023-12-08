package oop.assignment2.p1.train;

import java.util.Objects;

import oop.assignment2.p1.transportation.WheeledTransportation;

public class Train extends WheeledTransportation {
	private int numberOfVehicles;
	private String startingStation;
	private String destinationStation;
	private static int serialNumberCounter = 10000;

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
	
	private long getNextSerialNumber() {
		return this.serialNumberCounter;
	}

	@Override
	public String toString() {
		return "Train [numberOfVehicles=" + numberOfVehicles + ", startingStation=" + startingStation
				+ ", destinationStation=" + destinationStation + "]";
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
		return Objects.equals(destinationStation, other.destinationStation)
				&& numberOfVehicles == other.numberOfVehicles && Objects.equals(startingStation, other.startingStation);
	}

	
	
}
