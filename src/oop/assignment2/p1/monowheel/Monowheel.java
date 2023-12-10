package oop.assignment2.p1.monowheel;

import oop.assignment2.p1.transportation.WheeledTransportation;

public class Monowheel extends WheeledTransportation{
	private double maximumWeight;
	private static int serialNumberCounter = 55000;
	public double getMaximumWeight() {
		return maximumWeight;
	}
	public void setMaximumWeight(double maximumWeight) {
		this.maximumWeight = maximumWeight;
	}
	public Monowheel() {
		super();
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}
	

}
