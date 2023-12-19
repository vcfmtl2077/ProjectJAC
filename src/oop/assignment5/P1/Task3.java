package oop.assignment5.P1;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		List<Pair> pairList = new ArrayList<Pair>();
		Pair<Integer, String> p1 = new Pair(1, "hello");
		Pair<Integer, String> p2 = new Pair(12, "java");
		Pair<Integer, String> p3 = new Pair(1234, "world");
		pairList.add(p1);
		pairList.add(p2);
		pairList.add(p3);
		System.out.println(pairList);
	}

}
