// ----------------------------------------------------- 
// Assignment 3)
// Question: Ladder and Snake game/part 1
// Written by: wei feng - 6284289
// ----------------------------------------------------- 
package oop.assignment3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class LadderAndSnake {

	public static void main(String[] args) {
		Player[] playerArray = welcomeCheck();
		int[] ladder = initLadder();
		int[] snake = initSnake();
		shuffle(playerArray);
		
		System.out.println("Now, GAME  START ~~~~~~~~~~~");
		
		while(true) {
			
		}
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
		while (num < 2 || num > 4) {
			if (retry == 4) {
				System.out.println(
						"Bad attempt " + retry + "! You have exhausted all your chances. Prohram will terminate!");
				System.exit(0);
			}
			System.out.println(
					"Bad attempt " + retry + " -Invalid # of players. Please enter a # between 2 and 4 inclusively:");
			num = sc.nextInt();
			retry++;
		}
		Player[] arr = new Player[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Player(i + 1, 0);
		}
		return arr;
	}

	private static int[] initSnake() {
		int[] snake = new int[101]; // index from 1 to 100
		snake[98] = 78;
		snake[97] = 76;
		snake[95] = 24;
		snake[93] = 68;
		snake[79] = 10;
		snake[64] = 60;
		snake[48] = 30;
		snake[16] = 6;

		return snake;

	}

	private static int[] initLadder() {
		int[] ladder = new int[101]; // index from 1 to 100
		ladder[1] = 38;
		ladder[4] = 14;
		ladder[9] = 31;
		ladder[28] = 84;
		ladder[21] = 42;
		ladder[36] = 44;
		ladder[51] = 67;
		ladder[71] = 91;
		ladder[80] = 100;

		return ladder;
	}
	
	private static void shuffle(Player[] playerArray) {
		System.out.println("Start shuffling.....");
		for(int i=0;i<playerArray.length;i++) {
			int dice = flipDice();
			System.out.println("Player id: "+playerArray[i].getId()+" got a dice value of "+dice);
			playerArray[i].setDiceFlip(dice);
		}
		Arrays.sort(playerArray,new Comparator<Player>() {
			@Override
			public int compare(final Player p1,Player p2) {
				return Integer.signum(0-(p1.getDiceFlip()-p2.getDiceFlip()));
			}
			
		});
		System.out.print("Reached final decision on order of playing: ");
		for(int i=0;i<playerArray.length;i++) {
			System.out.print("Player"+playerArray[i].getId()+" ");
		}
	}
}
