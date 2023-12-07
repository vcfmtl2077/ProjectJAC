package oop.assignment2;

public class Train extends WheeledTransportation {
	private int numberOfVehicles;
	private String startingStation;
	private String destinationStation;

	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicles(int numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}

	public String getStartingStation() {
		return startingStation;
	}

	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Train() {
		super();
		this.setSerialNumber(10000);
	}

}
