package oop.assignment2.p1;

import oop.assignment2.p1.aircraft.Aircraft;
import oop.assignment2.p1.aircraft.WW2Airplane;
import oop.assignment2.p1.ferry.Ferry;
import oop.assignment2.p1.metro.Metro;
import oop.assignment2.p1.monowheel.Monowheel;
import oop.assignment2.p1.train.Train;
import oop.assignment2.p1.train.Tram;
import oop.assignment2.p1.transportation.WheeledTransportation;

public class Driver {

	public static void main(String[] args) {
		testObjectCreation();

	}

	private static void findLeastAndMostExpensiveAircraft(Object[] acs) {
		
	}
	
	private static void testObjectCreation() {
		
		// Test WheeledTransportation Object
		WheeledTransportation wt1 = new WheeledTransportation();
		System.out.println("WheeledTransportation object wt1 with SN: " + wt1.getSerialNumber()+" next object SN is: "+wt1.getNextSerialNumber());
		WheeledTransportation wt2 = new WheeledTransportation(4,200);
		System.out.println("WheeledTransportation object wt2 with SN: " + wt2.getSerialNumber()+" next object SN is: "+wt2.getNextSerialNumber());
		WheeledTransportation wt3 = new WheeledTransportation(wt2);
		System.out.println("WheeledTransportation object wt3 with SN: " + wt3.getSerialNumber()+" next object SN is: "+wt3.getNextSerialNumber());
		// Test Train Object
		Train train1 = new Train();
		System.out.println("Train object train1 with SN: " + train1.getSerialNumber()+" next object SN is: "+train1.getNextSerialNumber());
		Train train2 = new Train(20,300,5,"YUL","YVR");
		System.out.println("Train object train2 with SN: " + train2.getSerialNumber()+" next object SN is: "+train2.getNextSerialNumber());
		Train train3 = new Train(train2);
		System.out.println("Train object train3 with SN: " + train3.getSerialNumber()+" next object SN is: "+train3.getNextSerialNumber());
		// Test Metro Object
		Metro metro1 = new Metro();
		System.out.println("Metro object metro1 with SN: " + metro1.getSerialNumber()+" next object SN is: "+metro1.getNextSerialNumber());
		Metro metro2 = new Metro(20,70,4,"condordia","berri",30);
		System.out.println("Metro object metro2 with SN: " + metro2.getSerialNumber()+" next object SN is: "+metro2.getNextSerialNumber());
		Metro metro3 = new Metro(metro2);
		System.out.println("Metro object metro3 with SN: " + metro3.getSerialNumber()+" next object SN is: "+metro3.getNextSerialNumber());
		// Test Tram Object
		Tram tram1 = new Tram();
		System.out.println("Tram object tram1 with SN: " + tram1.getSerialNumber()+" next object SN is: "+tram1.getNextSerialNumber());
		Tram tram2 = new Tram(20,70,4,"condordia","berri",30,2000);
		System.out.println("Tram object tram2 with SN: " + tram2.getSerialNumber()+" next object SN is: "+tram2.getNextSerialNumber());
		Tram tram3 = new Tram(tram2);
		System.out.println("Tram object tram3 with SN: " + tram3.getSerialNumber()+" next object SN is: "+tram3.getNextSerialNumber());
		// Test Monowheel Object
		Monowheel monowheel1 = new Monowheel();
		System.out.println("Monowheel object monowheel1 with SN: " + monowheel1.getSerialNumber()+" next object SN is: "+monowheel1.getNextSerialNumber());
		Monowheel monowheel2 = new Monowheel(1,30,100);
		System.out.println("Monowheel object monowheel2 with SN: " + monowheel2.getSerialNumber()+" next object SN is: "+monowheel2.getNextSerialNumber());
		Monowheel monowheel3 = new Monowheel(monowheel2);
		System.out.println("Monowheel object monowheel3 with SN: " + monowheel3.getSerialNumber()+" next object SN is: "+monowheel3.getNextSerialNumber());
		// Test Ferry Object
		Ferry ferry1 = new Ferry();
		System.out.println("Ferry object ferry1 with SN: " + ferry1.getSerialNumber()+" next object SN is: "+ferry1.getNextSerialNumber());
		Ferry ferry2 = new Ferry(30,50000);
		System.out.println("Ferry object ferry2 with SN: " + ferry2.getSerialNumber()+" next object SN is: "+ferry2.getNextSerialNumber());
		Ferry ferry3 = new Ferry(ferry2);
		System.out.println("Ferry object ferry2 with SN: " + ferry3.getSerialNumber()+" next object SN is: "+ferry3.getNextSerialNumber());
		// Test Aircraft
		Aircraft ac1 = new Aircraft();
		System.out.println("Aircraft object ac1 with SN: " + ac1.getSerialNumber()+" next object SN is: "+ac1.getNextSerialNumber());
		Aircraft ac2 = new Aircraft(20000000,35000);
		System.out.println("Aircraft object ac2 with SN: " + ac2.getSerialNumber()+" next object SN is: "+ac2.getNextSerialNumber());
		Aircraft ac3 = new Aircraft(ac2);
		System.out.println("Aircraft object ac3 with SN: " + ac3.getSerialNumber()+" next object SN is: "+ac3.getNextSerialNumber());
		// Test WW2Airplane Object
		WW2Airplane ww2Airplane1 = new WW2Airplane();
		System.out.println("WW2Airplane object monowheel1 with SN: " + ww2Airplane1.getSerialNumber()+" next object SN is: "+ww2Airplane1.getNextSerialNumber());
		WW2Airplane ww2Airplane2 = new WW2Airplane(200000,10000,true);
		System.out.println("WW2Airplane object monowheel2 with SN: " + ww2Airplane2.getSerialNumber()+" next object SN is: "+ww2Airplane2.getNextSerialNumber());
		WW2Airplane ww2Airplane3 = new WW2Airplane(ww2Airplane2);
		System.out.println("WW2Airplane object monowheel3 with SN: " + ww2Airplane3.getSerialNumber()+" next object SN is: "+ww2Airplane3.getNextSerialNumber());
	}
}
