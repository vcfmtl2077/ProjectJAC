package oop.assignment2.p1.aircraft;

public class Aircraft {
	private double price;
	private double maximumElevation;
	private long serialNumber;

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
	}

	public Aircraft(double price, double maximumElevation) {
		super();
		this.price = price;
		this.maximumElevation = maximumElevation;
		this.serialNumber++;
	}

	public Aircraft(Aircraft ac) {
		super();
		this.price = ac.price;
		this.maximumElevation = ac.maximumElevation;
		this.serialNumber = ac.serialNumber++;
	}

}
