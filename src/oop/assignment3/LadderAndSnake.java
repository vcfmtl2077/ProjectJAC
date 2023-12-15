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
	private static Player[] playerArray;

	public static void main(String[] args) {
		playerArray = welcomeCheck();

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

	private static void shuffle(Player[] pa) {
		System.out.println("Start shuffling.....");
		for (int i = 0; i < pa.length; i++) {
			int dice = flipDice();
			System.out.println("Player id: " + pa[i].getId() + " got a dice value of " + dice);
			pa[i].setDiceFlip(dice);
		}
		checkTie(pa);
		Arrays.sort(pa, new Comparator<Player>() {
			@Override
			public int compare(final Player p1, Player p2) {
				return Integer.signum(0 - (p1.getDiceFlip() - p2.getDiceFlip())); // reverse comparison
			}

		});
		
		System.out.println("Finally, all players' dice values are:");
		for(int i=0;i<pa.length;i++) {
			System.out.println("Player "+pa[i].getId()+" get dice value: "+pa[i].getDiceFlip());
		}
		
		System.out.print("Reached final decision on order of playing: ");
		for (int i = 0; i < pa.length; i++) {
			System.out.print("Player" + pa[i].getId() + " ");
		}
		System.out.println();
	}

	private static void checkTie(Player[] pa) {
		Player[] tieArray = new Player[pa.length];
		for (int i = 0; i < pa.length; i++) {
			for (int j = pa.length - 1; j > i; j--) {
				if (pa[i].getDiceFlip() == pa[j].getDiceFlip()) {
					tieArray[i] = pa[i];
					tieArray[j] = pa[j];
					i++;
					j--;
				}
			}
		}

		if (getActualLength(tieArray) != 0) {
			Player[] ta = trimArray(tieArray);
			String namelist = "";
			for (int i = 0; i < ta.length; i++) {
				namelist += "Player " + ta[i].getId() + " ";
			}
			System.out.println("A tie was achieved within " + namelist + ". Attempting to break the tie");
			for (int i = 0; i < ta.length; i++) {
				int dice = flipDice();
				ta[i].setDiceFlip(dice);
				System.out.println("Player id: " + ta[i].getId() + " got a dice value of " + dice);
				updatePlayerArray(ta[i]);
			}
			checkTie(playerArray);
		} else {
			return;
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
		// Check wining condition after update position
		if (player.getPosition() == 100) {
			System.out.println();
			System.out.println("•	Game Over! Player " + player.getId() + " arrived at square " + player.getPosition()
					+ " successfully!");
			System.exit(0);
		}
		return player;
	}

	private static int getActualLength(Player[] pa) {
		int l = 0;
		for (int i = 0; i < pa.length; i++) {
			if (pa[i] != null) {
				l++;
			}
		}
		return l;
	}

	private static Player[] trimArray(Player[] pa) {
		int length = getActualLength(pa);
		Player[] tmp = new Player[length];
		int j = 0;
		for (int i = 0; i < pa.length; i++) {
			if (pa[i] != null) {
				tmp[j] = pa[i];
				j++;
			}
		}
		return tmp;
	}

	private static void updatePlayerArray(Player p) {
		for (int i = 0; i < playerArray.length; i++) {
			if (playerArray[i].getId() == p.getId()) {
				playerArray[i] = p;
			}
		}
	}
}
