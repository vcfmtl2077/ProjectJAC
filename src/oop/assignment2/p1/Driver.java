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
//		testObjectCreation();
//		testObjectTostringAndEquals();

		Object[] obja = objWithAircraft();
		Object[] objb = objWithoutAircraft();
		findLeastAndMostExpensiveAircraft(obja);
		findLeastAndMostExpensiveAircraft(objb);
	}

	private static void findLeastAndMostExpensiveAircraft(Object[] acs) {
		System.out.println("**************************************");
		double maxPrice = 0.0;
		Aircraft maxAc = new Aircraft();
		Aircraft minAc = new Aircraft();
		double minPrice = Double.MAX_VALUE;
		int acCount = 0;
		for (int i = 0; i < acs.length; i++) {
			if (acs[i] instanceof Aircraft) {
				acCount++;
				Aircraft ac = (Aircraft) acs[i];
				if (ac.getPrice() >= maxPrice) {
					maxPrice = ac.getPrice();
					maxAc = ac;
				} 
				if (ac.getPrice() <= minPrice) {
					minPrice = ac.getPrice();
					minAc = ac;
				}
			}
		}

		if (acCount == 0) {
			System.out.println("There is no Aircraft instance in the array.");
		} else {
			System.out.println("Find Aircraft instance account: " + acCount + ". The most expensive price is: "
					+ maxPrice + " and the least price is: " + minPrice);
			System.out.println("The most expensive price aircraft detail: " + maxAc);
			System.out.println("The least price aircraft detail: " + minAc);
		}

	}

	private static void testObjectCreation() {

		// Test WheeledTransportation Object
		WheeledTransportation wt1 = new WheeledTransportation();
		System.out.println("WheeledTransportation object wt1 with SN: " + wt1.getSerialNumber() + " next object SN is: "
				+ wt1.getNextSerialNumber());
		WheeledTransportation wt2 = new WheeledTransportation(4, 200);
		System.out.println("WheeledTransportation object wt2 with SN: " + wt2.getSerialNumber() + " next object SN is: "
				+ wt2.getNextSerialNumber());
		WheeledTransportation wt3 = new WheeledTransportation(wt2);
		System.out.println("WheeledTransportation object wt3 with SN: " + wt3.getSerialNumber() + " next object SN is: "
				+ wt3.getNextSerialNumber());
		// Test Train Object
		Train train1 = new Train();
		System.out.println("Train object train1 with SN: " + train1.getSerialNumber() + " next object SN is: "
				+ train1.getNextSerialNumber());
		Train train2 = new Train(20, 300, 5, "YUL", "YVR");
		System.out.println("Train object train2 with SN: " + train2.getSerialNumber() + " next object SN is: "
				+ train2.getNextSerialNumber());
		Train train3 = new Train(train2);
		System.out.println("Train object train3 with SN: " + train3.getSerialNumber() + " next object SN is: "
				+ train3.getNextSerialNumber());
		// Test Metro Object
		Metro metro1 = new Metro();
		System.out.println("Metro object metro1 with SN: " + metro1.getSerialNumber() + " next object SN is: "
				+ metro1.getNextSerialNumber());
		Metro metro2 = new Metro(20, 70, 4, "condordia", "berri", 30);
		System.out.println("Metro object metro2 with SN: " + metro2.getSerialNumber() + " next object SN is: "
				+ metro2.getNextSerialNumber());
		Metro metro3 = new Metro(metro2);
		System.out.println("Metro object metro3 with SN: " + metro3.getSerialNumber() + " next object SN is: "
				+ metro3.getNextSerialNumber());
		// Test Tram Object
		Tram tram1 = new Tram();
		System.out.println("Tram object tram1 with SN: " + tram1.getSerialNumber() + " next object SN is: "
				+ tram1.getNextSerialNumber());
		Tram tram2 = new Tram(20, 70, 4, "condordia", "berri", 30, 2000);
		System.out.println("Tram object tram2 with SN: " + tram2.getSerialNumber() + " next object SN is: "
				+ tram2.getNextSerialNumber());
		Tram tram3 = new Tram(tram2);
		System.out.println("Tram object tram3 with SN: " + tram3.getSerialNumber() + " next object SN is: "
				+ tram3.getNextSerialNumber());
		// Test Monowheel Object
		Monowheel monowheel1 = new Monowheel();
		System.out.println("Monowheel object monowheel1 with SN: " + monowheel1.getSerialNumber()
				+ " next object SN is: " + monowheel1.getNextSerialNumber());
		Monowheel monowheel2 = new Monowheel(1, 30, 100);
		System.out.println("Monowheel object monowheel2 with SN: " + monowheel2.getSerialNumber()
				+ " next object SN is: " + monowheel2.getNextSerialNumber());
		Monowheel monowheel3 = new Monowheel(monowheel2);
		System.out.println("Monowheel object monowheel3 with SN: " + monowheel3.getSerialNumber()
				+ " next object SN is: " + monowheel3.getNextSerialNumber());
		// Test Ferry Object
		Ferry ferry1 = new Ferry();
		System.out.println("Ferry object ferry1 with SN: " + ferry1.getSerialNumber() + " next object SN is: "
				+ ferry1.getNextSerialNumber());
		Ferry ferry2 = new Ferry(30, 50000);
		System.out.println("Ferry object ferry2 with SN: " + ferry2.getSerialNumber() + " next object SN is: "
				+ ferry2.getNextSerialNumber());
		Ferry ferry3 = new Ferry(ferry2);
		System.out.println("Ferry object ferry2 with SN: " + ferry3.getSerialNumber() + " next object SN is: "
				+ ferry3.getNextSerialNumber());
		// Test Aircraft
		Aircraft ac1 = new Aircraft();
		System.out.println("Aircraft object ac1 with SN: " + ac1.getSerialNumber() + " next object SN is: "
				+ ac1.getNextSerialNumber());
		Aircraft ac2 = new Aircraft(20000000, 35000);
		System.out.println("Aircraft object ac2 with SN: " + ac2.getSerialNumber() + " next object SN is: "
				+ ac2.getNextSerialNumber());
		Aircraft ac3 = new Aircraft(ac2);
		System.out.println("Aircraft object ac3 with SN: " + ac3.getSerialNumber() + " next object SN is: "
				+ ac3.getNextSerialNumber());
		// Test WW2Airplane Object
		WW2Airplane ww2Airplane1 = new WW2Airplane();
		System.out.println("WW2Airplane object monowheel1 with SN: " + ww2Airplane1.getSerialNumber()
				+ " next object SN is: " + ww2Airplane1.getNextSerialNumber());
		WW2Airplane ww2Airplane2 = new WW2Airplane(200000, 10000, true);
		System.out.println("WW2Airplane object monowheel2 with SN: " + ww2Airplane2.getSerialNumber()
				+ " next object SN is: " + ww2Airplane2.getNextSerialNumber());
		WW2Airplane ww2Airplane3 = new WW2Airplane(ww2Airplane2);
		System.out.println("WW2Airplane object monowheel3 with SN: " + ww2Airplane3.getSerialNumber()
				+ " next object SN is: " + ww2Airplane3.getNextSerialNumber());
	}

	private static void testObjectTostringAndEquals() {
		// Test WheeledTransportation Object
		WheeledTransportation wt1 = new WheeledTransportation();
		WheeledTransportation wt2 = new WheeledTransportation(4, 200);
		WheeledTransportation wt3 = new WheeledTransportation(wt2);
		System.out.println(wt2);
		System.out.println("wt1 equals with wt2: " + wt1.equals(wt2));
		System.out.println("wt3 equals with wt2: " + wt3.equals(wt2));
		// Test Train Object
		Train train1 = new Train();
		Train train2 = new Train(20, 300, 5, "YUL", "YVR");
		Train train3 = new Train(train2);
		System.out.println(train2);
		System.out.println("train1 equals with train2: " + train1.equals(train2));
		System.out.println("train3 equals with train2: " + train3.equals(train2));
		// Test Metro Object
		Metro metro1 = new Metro();
		Metro metro2 = new Metro(20, 70, 4, "condordia", "berri", 30);
		Metro metro3 = new Metro(metro2);
		System.out.println(metro2);
		System.out.println("metro2 equals with metro2: " + metro1.equals(metro2));
		System.out.println("metro2 equals with metro2: " + metro2.equals(metro2));

		// Test Tram Object
		Tram tram1 = new Tram();
		Tram tram2 = new Tram(20, 70, 4, "condordia", "berri", 30, 2000);
		Tram tram3 = new Tram(tram2);
		System.out.println(tram2);
		System.out.println("tram1 equals with tram2: " + tram1.equals(tram2));
		System.out.println("tram3 equals with tram2: " + tram3.equals(tram2));

		// Test Monowheel Object
		Monowheel monowheel1 = new Monowheel();
		Monowheel monowheel2 = new Monowheel(1, 30, 100);
		Monowheel monowheel3 = new Monowheel(monowheel2);
		System.out.println(monowheel2);
		System.out.println("monowheel1 equals with monowheel2: " + monowheel1.equals(monowheel2));
		System.out.println("monowheel3 equals with monowheel2: " + monowheel3.equals(monowheel2));

		// Test Ferry Object
		Ferry ferry1 = new Ferry();
		Ferry ferry2 = new Ferry(30, 50000);
		Ferry ferry3 = new Ferry(ferry2);
		System.out.println(ferry2);
		System.out.println("ferry1 equals with ferry2: " + ferry1.equals(ferry2));
		System.out.println("ferry3 equals with ferry2: " + ferry3.equals(ferry2));

		// Test Aircraft
		Aircraft ac1 = new Aircraft();
		Aircraft ac2 = new Aircraft(20000000, 35000);
		Aircraft ac3 = new Aircraft(ac2);
		System.out.println(ac2);
		System.out.println("ac1 equals with ac2: " + ac1.equals(ac2));
		System.out.println("ac3 equals with ac2: " + ac3.equals(ac2));

		// Test WW2Airplane Object
		WW2Airplane ww2Airplane1 = new WW2Airplane();
		WW2Airplane ww2Airplane2 = new WW2Airplane(200000, 10000, true);
		WW2Airplane ww2Airplane3 = new WW2Airplane(ww2Airplane2);
		System.out.println(ww2Airplane2);
		System.out.println("ww2Airplane1 equals with ww2Airplane2: " + ww2Airplane1.equals(ww2Airplane2));
		System.out.println("ww2Airplane3 equals with ww2Airplane2: " + ww2Airplane3.equals(ww2Airplane2));

	}

	private static Object[] objWithAircraft() {
		Object[] obja = new Object[20];
		WheeledTransportation wt1 = new WheeledTransportation(4, 200);
		WheeledTransportation wt2 = new WheeledTransportation(2, 100);
		WheeledTransportation wt3 = new WheeledTransportation(4, 150);
		AddToArray(obja,wt1);
		AddToArray(obja,wt2);
		AddToArray(obja,wt3);
		Train train1 = new Train(20, 100, 5, "YUL", "YVR");
		Train train2 = new Train(20, 200, 5, "YUL", "YVR");
		Train train3 = new Train(20, 300, 5, "YUL", "YVR");
		AddToArray(obja,train1);
		AddToArray(obja,train2);
		AddToArray(obja,train3);
		Metro metro1 = new Metro(20, 70, 4, "condordia", "berri", 30);
		Metro metro2 = new Metro(20, 70, 4, "condordia", "berri", 30);
		Metro metro3 = new Metro(20, 70, 4, "condordia", "berri", 30);
		AddToArray(obja,metro1);
		AddToArray(obja,metro2);
		AddToArray(obja,metro3);
		Tram tram1 = new Tram(20, 70, 4, "condordia", "berri", 30, 2000);
		Tram tram2 = new Tram(20, 70, 4, "condordia", "berri", 30, 2000);
		Tram tram3 = new Tram(20, 70, 4, "condordia", "berri", 30, 2000);
		AddToArray(obja,tram1);
		AddToArray(obja,tram2);
		AddToArray(obja,tram3);
		Monowheel monowheel1 = new Monowheel(1, 30, 100);
		Monowheel monowheel2 = new Monowheel(1, 30, 100);
		Monowheel monowheel3 = new Monowheel(1, 30, 100);
		WW2Airplane ww2Airplane2 = new WW2Airplane(15000, 10000, true);
		AddToArray(obja,ww2Airplane2);
		AddToArray(obja,monowheel1);
		AddToArray(obja,monowheel2);
		AddToArray(obja,monowheel3);
		Ferry ferry1 = new Ferry(30, 50000);
		Ferry ferry2 = new Ferry(30, 50000);
		Ferry ferry3 = new Ferry(30, 50000);
		AddToArray(obja,ferry1);
		AddToArray(obja,ferry2);
		AddToArray(obja,ferry3);
		Aircraft ac2 = new Aircraft(20000, 35000);
		AddToArray(obja,ac2);

		return obja;
	}

	private static Object[] objWithoutAircraft() {
		Object[] obja = new Object[20];
		WheeledTransportation wt1 = new WheeledTransportation(4, 200);
		WheeledTransportation wt2 = new WheeledTransportation(2, 100);
		WheeledTransportation wt3 = new WheeledTransportation(4, 150);
		AddToArray(obja,wt1);
		AddToArray(obja,wt2);
		AddToArray(obja,wt3);
		Train train1 = new Train(20, 100, 5, "YUL", "YVR");
		Train train2 = new Train(20, 200, 5, "YUL", "YVR");
		Train train3 = new Train(20, 300, 5, "YUL", "YVR");
		AddToArray(obja,train1);
		AddToArray(obja,train2);
		AddToArray(obja,train3);
		Metro metro1 = new Metro(20, 70, 4, "condordia", "berri", 30);
		Metro metro2 = new Metro(20, 70, 4, "condordia", "berri", 30);
		Metro metro3 = new Metro(20, 70, 4, "condordia", "berri", 30);
		AddToArray(obja,metro1);
		AddToArray(obja,metro2);
		AddToArray(obja,metro3);
		Tram tram1 = new Tram(20, 70, 4, "condordia", "berri", 30, 2000);
		Tram tram2 = new Tram(20, 70, 4, "condordia", "berri", 30, 2000);
		Tram tram3 = new Tram(20, 70, 4, "condordia", "berri", 30, 2000);
		AddToArray(obja,tram1);
		AddToArray(obja,tram2);
		AddToArray(obja,tram3);
		Monowheel monowheel1 = new Monowheel(1, 30, 100);
		Monowheel monowheel2 = new Monowheel(1, 30, 100);
		Monowheel monowheel3 = new Monowheel(1, 30, 100);
		Monowheel monowheel4 = new Monowheel(1, 30, 100);
		Monowheel monowheel5 = new Monowheel(1, 30, 100);
		AddToArray(obja,monowheel1);
		AddToArray(obja,monowheel2);
		AddToArray(obja,monowheel3);
		AddToArray(obja,monowheel4);
		AddToArray(obja,monowheel5);
		Ferry ferry1 = new Ferry(30, 50000);
		Ferry ferry2 = new Ferry(30, 50000);
		Ferry ferry3 = new Ferry(30, 50000);
		AddToArray(obja,ferry1);
		AddToArray(obja,ferry2);
		AddToArray(obja,ferry3);

		return obja;
	}

	private static void AddToArray(Object[] array, Object obj) {
		int size = getActualLength(array);
		array[size] = obj;
	}

	private static int getActualLength(Object[] oa) {
		int length = 0;
		for (int i = 0; i < oa.length; i++) {
			if (oa[i] != null) {
				length++;
			}
		}
		return length;
	}
}
