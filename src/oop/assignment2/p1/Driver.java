package oop.assignment2.p1;

import oop.assignment2.p1.metro.Metro;
import oop.assignment2.p1.train.Train;

public class Driver {

	public static void main(String[] args) {

		// Test Train Object
		Train t1 = new Train();
		System.out.println("Train object t1 with SN: " + t1.getSerialNumber());
		Train t2 = new Train();
		System.out.println("Train object m2 with SN: " + t2.getSerialNumber());
		// Test Metro Object
		Metro m1 = new Metro();
		System.out.println("Metro object m1 with SN: " + m1.getSerialNumber());
		Metro m2 = new Metro();
		System.out.println("Metro object m2 with SN: " + m2.getSerialNumber());

	}

	private static void findLeastAndMostExpensiveAircraft(Object[] acs) {
		
	}
}
