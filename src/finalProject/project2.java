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
		while (rows <=1) {
			System.out.print("How many row would you like to print? (More than 1 please) : ");
			rows = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("So whitch pattern do want to print now?");
	}

	public static void printMenu() {
		System.out.println("1)  54321   2)      1   3)  12345   4)    1");
		System.out.println("    5432           12        2345        123");
		System.out.println("    543           123         345       12345");
		System.out.println("    54           1234          45        123 ");
		System.out.println("    5           12345           5         1");
	}
	
	public static void printPattern1(int n) {
		
	}
	public static void printPattern2(int n) {
		
	}
	public static void printPattern3(int n) {
		
	}
	public static void printPattern4(int n) {
		
	}
}
