package oop.assignment5.P2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {
		String filePath = "src/oop/assignment5/P2/output.txt";
		try {
			FileWriter fw = new FileWriter(filePath);
			fw.write("Hello, this is line 1.\n");
			fw.write("Java File I/O is interesting!\n");
			fw.write("End of the assignment.\n");
			fw.close();
		} catch (IOException e) {
			System.out.println("Cannot whrite this file under the path: " + filePath);
			e.printStackTrace();
		}

	}

}
