// ----------------------------------------------------- 
// Assignment 3)
// Question: Ladder and Snake game/part 1
// Written by: wei feng - 6284289
// ----------------------------------------------------- 
package oop.assignment3;

import java.util.Random;
import java.util.Scanner;

public class LadderAndSnake {

	public static void main(String[] args) {
		Player[] playerArray = welcomeCheck();

	}

	private static int flipDice() {
		Random dice = new Random();
		return dice.nextInt(1, 6);
	}
	private static void play() {
		
	}
	private static Player[] welcomeCheck() {
		System.out.println("********************************************");
		System.out.println("*****  Welcome to Snake & Ladder game. *****");
		System.out.println("********************************************");
		System.out.println("Enter the number of players for your game - Number must be between 2 and 4 lunclusively:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int retry = 1;
		while(num<2||num>4) {
			if(retry==4) {
				System.out.println("Bad attempt "+retry+"! You have exhausted all your chances. Prohram will terminate!");
				System.exit(0);
			}
			System.out.println("Bad attempt "+retry+" -Invalid # of players. Please enter a # between 2 and 4 inclusively:");
			num = sc.nextInt();
			retry++;
		}
		Player[] arr = new Player[num];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Player();
		}
		return arr;
	}
}
