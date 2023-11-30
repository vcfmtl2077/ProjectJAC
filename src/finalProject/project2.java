package finalProject;

import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		int choice, rows;
		
		System.out.print(" - - - Welcome to Wei's Triangle/Diamond Printer - - -\n");
		
		do {
		System.out.println("\n\nWhitch pattern do want to print?");
		printMenu();
		System.out.print("Enter your choice (5 to Quit) : ");
		choice = inputckeck( 1, 5);
		if(choice != 5) {
			System.out.print("How many row would you like to print ? range [1-9] : ");
			rows = inputckeck( 1, 9);
			
			switch(choice) {
			case 1: printPattern1(rows);
					break;
			case 2: printPattern2(rows);
					break;
			case 3:printPattern3(rows);
				   break;
			case 4: printPattern4(rows, (int) Math.ceil((double) rows/2),1); //no of top or bottom rows = spaces = Math.ceil((double) rows/2)
			}
		}
		}while(choice != 5);
		
		System.out.print("You choose 5 and the program is about to quit. GoodBye!");

	}

	public static void printMenu() {
		System.out.println("1)  54321   2)      1   3)  12345   4)    1");
		System.out.println("    5432           12        2345        123");
		System.out.println("    543           123         345       12345");
		System.out.println("    54           1234          45        123 ");
		System.out.println("    5           12345           5         1");
	}
	
	public static int inputckeck( int range1, int range2){
		boolean flag;
		double num;

		Scanner sc = new Scanner(System.in);

		do  {
			num = sc.nextDouble();
		
			if((num < range1 || num > range2) || (num%1 > 0)){
				System.out.print("Your input should be integer in this range ["+ range1 + "-" + range2 + "] : ");
				flag = true;
			}else {
				flag = false;
			}

		}while(flag);
		
		return ((int)num);
	}
	
	public static void printPattern1(int n) {
		int i,j;
		
		for(i=n; i>0; i--) {
			for(j=0; j< i; j++) {
				System.out.print(n-j);
			}
			System.out.println();
		}
		
	}
	
	public static void printPattern2(int n) {
		int i,j,s=0;
		
		for(i=1; i<=n; i++) {
			//spaces
			for(s=0; s<n-i ; s++) {
				System.out.print(" ");
			}
			
			for(j=1; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	public static void printPattern3(int n) {
		int i,j,s=0;
		
		for(i=n; i>0; i--) {
			//spaces
			for(s=0; s<n-i ; s++) {
				System.out.print(" ");
			}
			
			for(j=i; j>0; j--) {
				System.out.print(n-j+1);
			}
			
			System.out.println();
		}
	}
	
	public static void printPattern4(int n, int space,int numbers) {
		int i;
		//base condition
		if(space == 0) {
			return;
		}
		
		//spaces
		for(i=0 ; i<=space ; i++) {
			System.out.print(" ");
		}
		
		//printing numbers
		for(i=1; i<=numbers; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		printPattern4(n, space-1, numbers+2);
		
		//bottom part executed in recursion
		
		//condition space>1 is to skip repeated middle line in case n is odd number
		if( space >1 || (n%2 == 0)) {	
				//spaces
				for(i=0 ; i<=space ; i++) {
					System.out.print(" ");
				}
				
				for(i=1; i<=numbers; i++) {
					System.out.print(i);
				}
				
				System.out.println();
		}
		
	}
}
