package finalProject;

import java.util.Scanner;

public class project1 {

	private static int inputErrors = 0;
	
	public static void main(String[] args) {
		int nItems;
		double sum;
		double[] pArray = null;
		
		// Input number of items
		System.out.print("Please enter the number of items bought [1...10]: ");
		nItems = inputckeck(1, 10);

		// Input Items
		pArray = InputItems(nItems);
		
		// Prices summation
		sum = pricesSum(pArray);

		//  GST Rate value
		System.out.print("Please enter the tax rate of GST in % [0...14]: ");
		double gstRate = taxRate(14.0);

		//  QST Rate value
		System.out.print("Please enter the tax rate of QST in % [0...17]: ");
		double qstRate = taxRate(17.0);
		

		double GST = taxValue(sum, gstRate );
		double QST = taxValue((sum+ GST), qstRate );
		
		if(inputErrors > 0) {
			System.out.printf("You have entered %d invalid inputs", inputErrors);
		}

		System.out.printf("Sub-Total: $ %.2f \n",sum);
		System.out.printf("GST: $ %.2f \n", GST);
		System.out.printf("QST: $ %.2f \n" , QST);
		System.out.printf("Total: $ %.2f \n" , (sum + GST + QST));
		
		
	}
	
	
	
	public static double taxValue(double sum,double taxRate ) {
		
		return sum * taxRate;
	}
	
	public static double taxRate(double maxTaxRange) {
		
		double tax = inputckeck(0.0, maxTaxRange);
		tax = tax / 100;
		
		return tax;
	}
	
	public static double[] InputItems(int n){
		int i;
		double[] pArray = new double[n];
		
		for(i=0; i< n; i++) {
			System.out.print("Please enter the price of item " + (i+1) + " [1...1000]: ");
				pArray[i] = inputckeck(1.0, 1000.0);
			}
		
		return pArray;
	}
	
	public static double pricesSum(double[] arr)
	{   int i;
		double sum = 0;
		
		for (i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
		}
		
		return sum;
	}
	
	public static int inputckeck( int range1, int range2){
		boolean flag;
		double num;

		Scanner sc = new Scanner(System.in);

		do  {
			num = sc.nextDouble();
		
			if((num < range1 || num > range2) || (num%1 > 0)){
				System.out.print("Your input should be integer in this range ["+ range1 + "-" + range2 + "] : ");
				inputErrors++;
				flag = true;
			}else {
				flag = false;
			}

		}while(flag);
		
		return ((int)num);
	}
	
	public static double inputckeck( double range1, double range2){
		boolean flag;
		double num;

		Scanner sc = new Scanner(System.in);

		do  {
			num = sc.nextDouble();
			if(num < range1 || num > range2){
				System.out.print("Your input should be in this range ["+ range1 + "-" + range2 + "] : ");
				inputErrors++;
				flag = true;
			}else {
				flag = false;
			}

		}while(flag);
		
		return num;
	}

	

}
