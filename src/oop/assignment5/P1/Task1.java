package oop.assignment5.P1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		List<String> wordList = new ArrayList<String>();
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("orange");
		wordList.add("grape");
		wordList.add("kiwi");
		System.out.println(wordList);

		wordList.add(0, "pear");
		System.out.println(wordList);
		wordList.remove(2);
		System.out.println(wordList);
		System.out.println("Check if the list contains the word \"orange.\": " + wordList.contains("orange"));

	}

}
