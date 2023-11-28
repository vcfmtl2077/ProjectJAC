package finalProject;

import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		System.out.print("Please enter the number of items bought [1...10]:");
		Scanner sc = new Scanner(System.in);
		int nItems = sc.nextInt();
		System.out.println();
		// Verify the item input number
		while (nItems < 1 || nItems > 10) {
			System.out.print("Please enter the number of items bought [1...10]: ");
			nItems = sc.nextInt();
			System.out.println();
		}

		// Verify each item input price
		int itemIndex = 1;
		double pItems = 0.0;
		double[] pArray = new double[nItems];
		while (itemIndex <= nItems) {
			System.out.print("Please enter the price of item " + itemIndex + " [1...1000]: ");
			pItems = sc.nextDouble();
			if (pItems >= 1 && pItems <= 1000) {
				pArray[itemIndex - 1] = pItems;
				itemIndex++;
			}
			System.out.println();
		}

		// Verify GST input value
		System.out.print("Please enter the tax rate of GST in % [0...14]:");
		double gst = sc.nextDouble();
		while (gst < 0 || gst > 14) {
			System.out.print("Please enter the tax rate of GST in % [0...14]:");
			gst = sc.nextDouble();
		}
		System.out.println();

		// Verify QST input value
		System.out.print("Please enter the tax rate of QST in % [0...17]:");
		double qst = sc.nextDouble();
		while (qst < 0 || qst > 17) {
			System.out.print("Please enter the tax rate of QST in % [0...17]:");
			qst = sc.nextDouble();
		}
		System.out.println();

		System.out.println("You have entered " + nItems + " invalid inputs.");

		double sum = 0;
		for (int i = 0; i < pArray.length; i++) {
			sum += pArray[i];
		}

		double gstValue = sum * gst / 100;
		double qstValue = (sum + gstValue) * qst / 100;

		System.out.println("Sub Total: $ " + (sum + gstValue + qstValue));
		System.out.println("GST: $ " + gstValue);
		System.out.println("QST: $ " + qstValue);

	}

}
