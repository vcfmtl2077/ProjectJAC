package oop.assignment2.p1.transportation;

import java.util.Objects;

public class WheeledTransportation {
	private int numberOfWheels;
	private double maximumSpeed;
	private long serialNumber;
	private static long serialNumberCounter;

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public WheeledTransportation(int numberOfWheels, double maximumSpeed) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.maximumSpeed = maximumSpeed;
		this.serialNumber = serialNumberCounter;
		serialNumberCounter++;
	}

	public WheeledTransportation() {
		super();
		this.serialNumber = serialNumberCounter;
		serialNumberCounter++;
	}

	public WheeledTransportation(WheeledTransportation wt) {
		super();
		this.maximumSpeed = wt.maximumSpeed;
		this.numberOfWheels = wt.numberOfWheels;
		this.serialNumber = serialNumberCounter;
		serialNumberCounter++;
		;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}

	@Override
	public String toString() {
		return "This WheeledTransportation- serial #" + this.getSerialNumber() + " - has " + this.getNumberOfWheels()
				+ " wheels, has a maximum speed of " + this.getMaximumSpeed() + " km/hr.";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WheeledTransportation other = (WheeledTransportation) obj;
		return Double.doubleToLongBits(this.getMaximumSpeed()) == Double.doubleToLongBits(other.getMaximumSpeed())
				&& this.getNumberOfWheels() == other.getNumberOfWheels();
	}

}
