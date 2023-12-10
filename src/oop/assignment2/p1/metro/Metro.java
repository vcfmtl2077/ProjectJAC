package oop.assignment2.p1.metro;

import oop.assignment2.p1.train.Train;

public class Metro extends Train {
	private int totalNumberOfStops;
	private static int serialNumberCounter = 25000;

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

}
