// ----------------------------------------------------- 
// Assignment 3
// Question: Ladder and Snake game/part1
// Written by: wei feng - 6284289
// ----------------------------------------------------- 
package oop.assignment3;

public class Player {
	private int id;
	private int position;
	private int diceFlip = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getDiceFlip() {
		return diceFlip;
	}

	public void setDiceFlip(int diceFlip) {
		this.diceFlip = diceFlip;
	}

	public Player(int id, int position) {
		super();
		this.id = id;
		this.position = position;
	}

	public void move(int step) {
		this.position += step;
	}

};