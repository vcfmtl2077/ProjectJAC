package finalProject;

import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		System.out.print(" - - - Welcome to Wei's Triangle/Diamond Printer - - -");
		System.out.println();
		System.out.println();
		System.out.println("Whitch pattern do want to print?");
		printMenu();
		System.out.print("Enter your choice (5 to Quit) : ");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();

		while (type < 1 || type > 5) {
			System.out.println("Woops! " + type + " is an illegal choice. Tey again.");
			System.out.print("Please enter a number between 1 and 5 inclusive: ");
			type = sc.nextInt();
			System.out.println();
		}
		if (type == 5) {
			System.out.print("You choose 5 and the program is about to quit. GoodBye!");
			sc.close();
			return;
		}

		System.out.print("How many row would you like to print? (More than 1 please) : ");
		int rows = sc.nextInt();
		System.out.println();
		while (rows <= 1) {
			System.out.print("How many row would you like to print? (More than 1 please) : ");
			rows = sc.nextInt();
			System.out.println();
		}
		while (type != 5) {
			switch (rows) {
			case 1: {
				printPattern1(rows);
			}
			case 2: {
				printPattern2(rows);
			}
			case 3: {
				printPattern3(rows);
			}
			case 4: {
				printPattern4(rows);
			}
			default: {
				System.out.println("So which pattern do you want to print now?");
				printMenu();
				System.out.print("Enter your choice (5 to Quit) : ");
				type = sc.nextInt();
				if(type==5) {
					System.out.print("You choose 5 and the program is about to quit. GoodBye!");
					sc.close();
					return;
				}
			}
			}
		}
		


	}

	public static void printMenu() {
		System.out.println("1)  54321   2)      1   3)  12345   4)    1");
		System.out.println("    5432           12        2345        123");
		System.out.println("    543           123         345       12345");
		System.out.println("    54           1234          45        123 ");
		System.out.println("    5           12345           5         1");
	}

	public static void printPattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i);j++) {
				System.out.print(n-j);
			}
			System.out.println();
		}
	}

	public static void printPattern2(int n) {
		for(int i=0;i<n;i++) {
			int j=0;
			while(j<n-i-1) {
				System.out.print(" ");
				j++;
			}
			for(int k=1;k<(n-j+1);k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void printPattern3(int n) {
		for(int i=0;i<n;i++) {
			int j=0;
			while(j<i) {
				System.out.print(" ");
				j++;
			}
			for(int k=j+1;k<n+1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void printPattern4(int n) {

	}
}
