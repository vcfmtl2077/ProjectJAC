package oop.assignment2.p1.aircraft;

import java.util.Objects;

public class WW2Airplane extends Aircraft {
	private boolean twinEngine;
	private static long serialNumberCounter = 80000;

	public boolean isTwinEngine() {
		return twinEngine;
	}

	public void setTwinEngine(boolean twinEngine) {
		this.twinEngine = twinEngine;
	}

	public WW2Airplane() {
		super();
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public WW2Airplane(double price, double maximumElevation, boolean twinEngine) {
		super(price, maximumElevation);
		this.twinEngine = twinEngine;
		this.setSerialNumber(this.serialNumberCounter);
		this.serialNumberCounter++;
	}

	public WW2Airplane(WW2Airplane w2a) {
		super(w2a);
		this.twinEngine = w2a.twinEngine;
		this.setPrice(w2a.getPrice());
		this.setMaximumElevation(w2a.getMaximumElevation());
		this.setSerialNumber(serialNumberCounter);
		serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}

	@Override
	public String toString() {
		return "This WW2Airplane- serial #" + this.getSerialNumber() + " - has a maximum maximumElevation of "
				+ this.getMaximumElevation() + ", pirce is " + this.getPrice() + " and twin engine status: "
				+ this.isTwinEngine();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WW2Airplane other = (WW2Airplane) obj;
		return Double.doubleToLongBits(this.getMaximumElevation()) == Double
				.doubleToLongBits(other.getMaximumElevation())
				&& Double.doubleToLongBits(this.getPrice()) == Double.doubleToLongBits(other.getPrice())
				&& this.twinEngine == other.twinEngine;
	}

}
