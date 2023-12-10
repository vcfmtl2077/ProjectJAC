package oop.assignment2.p1.ferry;

public class Ferry {
	private double maximumSpeed;
	private double maximumLoad;
	private long serialNumber;
	private static int serialNumberCounter = 70000;
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
}
