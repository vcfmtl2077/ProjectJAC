package oop.assignment2.p1.monowheel;

import java.util.Objects;

import oop.assignment2.p1.transportation.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
	private double maximumWeight;
	private static long serialNumberCounter = 55000;

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

	public Monowheel(int numberOfWheels, double maximumSpeed, double maximumWeight) {
		super(numberOfWheels, maximumSpeed);
		this.maximumWeight = maximumWeight;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public Monowheel(Monowheel mono) {
		super(mono);
		this.maximumWeight = mono.maximumWeight;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}

	@Override
	public String toString() {
		return "This Monowheel- serial #" + this.getSerialNumber() + " - has " + this.getNumberOfWheels()
				+ " wheels, has a maximum speed of " + this.getMaximumSpeed() + " km/hr. and its maximum weight is "
				+ this.getMaximumWeight();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monowheel other = (Monowheel) obj;
		return Double.doubleToLongBits(this.getMaximumSpeed()) == Double.doubleToLongBits(other.getMaximumSpeed())
				&& this.getNumberOfWheels() == other.getNumberOfWheels() && Double
						.doubleToLongBits(this.maximumWeight) == Double.doubleToLongBits(other.maximumWeight);
	}
}
