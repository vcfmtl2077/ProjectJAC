package oop.assignment2.p1.metro;

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
		super();
		this.totalNumberOfStops = mt.totalNumberOfStops;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}
}
