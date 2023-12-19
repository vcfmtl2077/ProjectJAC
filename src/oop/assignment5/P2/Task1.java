package oop.assignment5.P2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		String path = "src/oop/assignment5/P2/input.txt";
		int total = 0;
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				System.out.print(line);
				total += countTotalCharactersInLine(line);
				System.out.print(" -> This line contains : " + total + " characters. \n");
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find this file under the path: " + path);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot read this file under the path: " + path);
			e.printStackTrace();
		}
	}

	private static int countTotalCharactersInLine(String key) {
		String s = key.trim();
		return s.length();

	}
}
