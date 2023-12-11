package oop.assignment2.p1.aircraft;

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
		super();
		this.twinEngine = w2a.twinEngine;
		this.setPrice(w2a.getPrice());
		this.setMaximumElevation(w2a.getMaximumElevation());
		this.setSerialNumber(serialNumberCounter);
		serialNumberCounter++;
	}

	public static long getNextSerialNumber() {
		return serialNumberCounter;
	}
}
