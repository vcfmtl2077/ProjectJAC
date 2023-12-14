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
	private static int[] ladder;
	private static int[] snake;

	public static void main(String[] args) {
		Player[] playerArray = welcomeCheck();

		play(playerArray);

		System.out.println("Now, GAME  START ~~~~~~~~~~~");
		int round = 1;
		while (true) {
			System.out.println("**	Round " + round + " Start. All player start flipping dice and moving.");
			for (int i = 0; i < playerArray.length; i++) {
				int dice = flipDice();
				System.out.print("•	Player " + playerArray[i].getId() + " got a dice value of " + dice + "; ");
				playerArray[i].setDiceFlip(dice);
				playerArray[i].move(dice);
				playerArray[i] = verifyPlayerPosition(playerArray[i]);

			}
			System.out.println("•	Game not over; flipping again \n");
			round++;
		}

	}

	private static int flipDice() {
		Random dice = new Random();
		return dice.nextInt(1, 6);
	}

	private static void play(Player[] playerArray) {
		ladder = initLadder();
		snake = initSnake();
		shuffle(playerArray);
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
		for (int i = 0; i < playerArray.length; i++) {
			int dice = flipDice();
			System.out.println("Player id: " + playerArray[i].getId() + " got a dice value of " + dice);
			playerArray[i].setDiceFlip(dice);
		}
		Arrays.sort(playerArray, new Comparator<Player>() {
			@Override
			public int compare(final Player p1, Player p2) {
				return Integer.signum(0 - (p1.getDiceFlip() - p2.getDiceFlip()));
			}

		});
		System.out.print("Reached final decision on order of playing: ");
		for (int i = 0; i < playerArray.length; i++) {
			System.out.print("Player" + playerArray[i].getId() + " ");
		}
	}

	private static Player verifyPlayerPosition(Player player) {
		if (player.getPosition() == 100) {
			System.out.println();
			System.out.println("•	Game Over! Player " + player.getId() + " arrived at square " + player.getPosition()
					+ " successfully!");
			System.exit(0);
		} else if (player.getPosition() < 100) {
			player = checkLadderAndSnake(player);
		} else {
			int overStep = player.getPosition() - 100;
			player.setPosition(100 - overStep);
			player = checkLadderAndSnake(player);
		}
		return player;
	}

	private static Player checkLadderAndSnake(Player player) {
		int position = player.getPosition();
		if (ladder[position] != 0) {
			System.out.print("gone to square " + position + " then up to square " + ladder[position] + "\n");
			player.setPosition(ladder[position]);
		} else if (snake[position] != 0) {
			System.out.print("gone to square " + position + " then down to square " + snake[position] + "\n");
			player.setPosition(snake[position]);
		} else {
			System.out.print("now in square " + position + "\n");
		}
		return player;
	}
}
