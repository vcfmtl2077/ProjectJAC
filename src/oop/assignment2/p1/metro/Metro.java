package oop.assignment2.p1.metro;

import oop.assignment2.p1.train.Train;

public class Metro extends Train {
	private int totalNumberOfStops;

	public int getTotalNumberOfStops() {
		return totalNumberOfStops;
	}

	public void setTotalNumberOfStops(int totalNumberOfStops) {
		this.totalNumberOfStops = totalNumberOfStops;
	}

	public Metro() {
		super();
	}

}
