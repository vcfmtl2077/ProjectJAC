package oop.assignment2;

import java.util.Random;

public class Metro extends Train {
	private int totalNumberOfStops;

	public int getTotalNumberOfStops() {
		return totalNumberOfStops;
	}

	public void setTotalNumberOfStops(int totalNumberOfStops) {
		this.totalNumberOfStops = totalNumberOfStops;
	}

//	public Metro() {
//		this.setSerialNumber(new Random().nextLong(0, Long.MAX_VALUE));
//	}

}
