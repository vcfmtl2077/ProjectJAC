package oop.assignment2.p1.transportation;

public class WheeledTransportation {
	private int numberOfWheels;
	private double maximumSpeed;
	private long serialNumber;

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
		this.serialNumber++;
	}

	public WheeledTransportation() {
		super();
	}

	public WheeledTransportation(WheeledTransportation wt) {
		super();
		this.maximumSpeed = wt.maximumSpeed;
		this.numberOfWheels = wt.numberOfWheels;
		this.serialNumber++;
	}
}
