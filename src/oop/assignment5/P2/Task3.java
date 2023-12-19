package oop.assignment5.P2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {

	public static void main(String[] args) {
		String filePath = "src/oop/assignment5/P2/output.txt";
		try {
			FileWriter fw = new FileWriter(filePath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write("Appending new line.\n");
			bw.write("File I/O without buffers.\n");

			bw.close();
		} catch (IOException e) {
			System.out.println("Cannot whrite this file under the path: " + filePath);
			e.printStackTrace();
		}

	}

}
