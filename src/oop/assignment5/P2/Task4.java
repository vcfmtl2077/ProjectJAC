package oop.assignment5.P2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) {
		String file = "src/oop/assignment5/P2/custom.txt";
		whriteMessageToFile(file,"Hello Java");
		whriteMessageToFile(file,"5. Challenge:");
		whriteMessageToFile(file,"Implement a method that takes a filename and a String as input and writes the String to the specified file without using buffers.");
		whriteMessageToFile(file,"Test this method by writing a custom message to a new file named \"custom.txt.\"");
		whriteMessageToFile(file,"End of the assignment.");
		
	}
	
	private static void whriteMessageToFile(String filename, String message) {
		try {
			FileWriter fw = new FileWriter(filename, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(message);
			bw.close();
		} catch (IOException e) {
			System.out.println("Cannot whrite this file under the path: " + filename);
			e.printStackTrace();
		}
	}

}
