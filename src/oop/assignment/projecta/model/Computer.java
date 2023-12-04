package oop.assignment.projecta.model;

import java.util.Objects;

public class Computer {
	String brand = "Aplle"; // default brand
	String model = "Macbook"; // default model
	long SN = 123456789; // default SN
	double price = 7000; // default price

	
	
	public Computer() {
		super();
	}

	public Computer(String brand, String model, long sN, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.SN = sN;
		this.price = price;
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
	}

	public Computer(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public Computer(String brand, String model, long sN) {
		super();
		this.brand = brand;
		this.model = model;
		this.SN = sN;
	}

	@Override
	public String toString() {
		return "computer [brand: " + brand + ", model: " + model + ", SN: " + SN + ", price: " + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Computer other = (Computer) obj;
		return this.brand == other.brand && this.model == other.model
				&& this.price == other.price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getSN() {
		return this.SN;
	}

	public void setSN(long sN) {
		this.SN = sN;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
