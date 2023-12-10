package oop.assignment2.p1;

import oop.assignment2.p1.aircraft.WW2Airplane;
import oop.assignment2.p1.ferry.Ferry;
import oop.assignment2.p1.metro.Metro;
import oop.assignment2.p1.monowheel.Monowheel;
import oop.assignment2.p1.train.Train;
import oop.assignment2.p1.train.Tram;

public class Driver {

	public static void main(String[] args) {
		
		// Test Train Object
		Train train1 = new Train();
		System.out.println("Train object train1 with SN: " + train1.getSerialNumber());
		Train train2 = new Train();
		System.out.println("Train object train2 with SN: " + train2.getSerialNumber());
		// Test Metro Object
		Metro metro1 = new Metro();
		System.out.println("Metro object metro1 with SN: " + metro1.getSerialNumber());
		Metro metro2 = new Metro();
		System.out.println("Metro object metro2 with SN: " + metro2.getSerialNumber());
		// Test Tram Object
		Tram tram1 = new Tram();
		System.out.println("Tram object tram1 with SN: " + tram1.getSerialNumber());
		Tram tram2 = new Tram();
		System.out.println("Tram object tram2 with SN: " + tram2.getSerialNumber());
		// Test Monowheel Object
		Monowheel monowheel1 = new Monowheel();
		System.out.println("Monowheel object monowheel1 with SN: " + monowheel1.getSerialNumber());
		Monowheel monowheel2 = new Monowheel();
		System.out.println("Monowheel object monowheel2 with SN: " + monowheel2.getSerialNumber());
		// Test Ferry Object
		Ferry ferry1 = new Ferry();
		System.out.println("Ferry object ferry1 with SN: " + ferry1.getSerialNumber());
		Ferry ferry2 = new Ferry();
		System.out.println("Ferry object ferry2 with SN: " + ferry2.getSerialNumber());
		// Test WW2Airplane Object
		WW2Airplane ww2Airplane1 = new WW2Airplane();
		System.out.println("WW2Airplane object monowheel1 with SN: " + ww2Airplane1.getSerialNumber());
		WW2Airplane ww2Airplane2 = new WW2Airplane();
		System.out.println("WW2Airplane object monowheel2 with SN: " + ww2Airplane2.getSerialNumber());
		

	}

	private static void findLeastAndMostExpensiveAircraft(Object[] acs) {
		
	}
}
