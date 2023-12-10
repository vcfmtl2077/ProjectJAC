package oop.assignment2.p1.aircraft;

public class WW2Airplane extends Aircraft{
	private boolean twinEngine;
	private static int serialNumberCounter = 80000;
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
	

}
