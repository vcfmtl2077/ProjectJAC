package oop.assignment2.p2;

import java.lang.reflect.InvocationTargetException;

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
		
		Object[] ori = objWithAircraft();
		for(int i=0;i<ori.length;i++) {
			System.out.println(ori[i]);
		}
		
		System.out.println("****************************************************************");
		
		
		Object[] cln = copyTheObjects(ori);
		
		for(int i=0;i<cln.length;i++) {
			System.out.println(cln[i]);
		}

		System.out.println("****************************************************************");
		
		for(int i=0;i<ori.length;i++) {
			System.out.println("Index "+i+" if ori element equals with cln element: "+ori[i].equals(cln[i]));
		}
	}
	
	private static Object[] copyTheObjects(Object[] acs) {
		Object[] obs = new Object[acs.length];
		for(int i=0;i<acs.length;i++) {
			try {
				obs[i] = acs[i].getClass().getDeclaredConstructor(acs[i].getClass()).newInstance(acs[i]);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {

				e.printStackTrace();
			}
		}
		return obs;
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
