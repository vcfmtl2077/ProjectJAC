package oop.assignment2.p1.ferry;

import java.util.Objects;

public class Ferry {
	private double maximumSpeed;
	private double maximumLoad;
	private long serialNumber;
	private static long serialNumberCounter = 70000;

	public double getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public double getMaximumLoad() {
		return maximumLoad;
	}

	public void setMaximumLoad(double maximumLoad) {
		this.maximumLoad = maximumLoad;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Ferry() {
		super();
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public Ferry(double maximumSpeed, double maximumLoad) {
		super();
		this.maximumSpeed = maximumSpeed;
		this.maximumLoad = maximumLoad;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public Ferry(Ferry fr) {
		super();
		this.maximumLoad = fr.maximumLoad;
		this.maximumSpeed = fr.maximumSpeed;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}

	@Override
	public String toString() {
		return "This Ferry- serial #" + this.getSerialNumber() + " - has a maximum speed of " + this.getMaximumSpeed()
				+ " km/hr, maximum load is " + this.getMaximumLoad();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ferry other = (Ferry) obj;
		return Double.doubleToLongBits(this.getMaximumLoad()) == Double.doubleToLongBits(other.getMaximumLoad())
				&& Double.doubleToLongBits(this.getMaximumSpeed()) == Double.doubleToLongBits(other.getMaximumSpeed());
	}
}
