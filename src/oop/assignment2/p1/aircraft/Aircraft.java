package oop.assignment2.p1.aircraft;

import java.util.Objects;

public class Aircraft {
	private double price;
	private double maximumElevation;
	private long serialNumber;
	private static long serialNumberCounter;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMaximumElevation() {
		return maximumElevation;
	}

	public void setMaximumElevation(double maximumElevation) {
		this.maximumElevation = maximumElevation;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Aircraft() {
		super();
		this.serialNumber = serialNumberCounter;
		serialNumberCounter++;
	}

	public Aircraft(double price, double maximumElevation) {
		super();
		this.price = price;
		this.maximumElevation = maximumElevation;
		this.serialNumber = serialNumberCounter;
		serialNumberCounter++;
	}

	public Aircraft(Aircraft ac) {
		super();
		this.price = ac.price;
		this.maximumElevation = ac.maximumElevation;
		this.serialNumber = serialNumberCounter;
		serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}

	@Override
	public String toString() {
		return "This Aircraft- serial #" + this.getSerialNumber() + " - has a maximum maximumElevation of "
				+ this.getMaximumElevation() + ", and pirce is " + this.getPrice();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aircraft other = (Aircraft) obj;
		return Double.doubleToLongBits(this.getMaximumElevation()) == Double
				.doubleToLongBits(other.getMaximumElevation())
				&& Double.doubleToLongBits(this.getPrice()) == Double.doubleToLongBits(other.getPrice());
	}

}
