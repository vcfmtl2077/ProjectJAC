package oop.assignment5.P1;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		List<Object> objList = new ArrayList<Object>();
		Pair<Integer, String> p1 = new Pair(1, "hello");
		Pair<Integer, String> p2 = new Pair(12, "java");
		Pair<Integer, String> p3 = new Pair(1234, "world");
		objList.add(p1);
		objList.add(p2);
		objList.add(p3);
		objList.add("apple");
		objList.add("banana");
		objList.add("orange");
		objList.add("grape");
		objList.add("kiwi");
		System.out.println(objList);
	}

}
