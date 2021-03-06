package edu.cpp.cs.cs141.classproject;

import java.io.Serializable;

public class Player implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6775177897769827569L;
	private int numBullets;
	private int numLives;
	
	private int row;
	private int col;
	
	private boolean isInvincible;
	
	public Player(){
		row = 8;
		col = 0;
		numBullets = 1;
		numLives = 3;
		isInvincible = false;
	}

	public boolean isInvincible() {
		return isInvincible;
	}

	public void setInvincible(boolean isInvincible) {
		this.isInvincible = isInvincible;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getNumBullets() {
		return numBullets;
	}

	public void setNumBullets(int numBullets) {
		this.numBullets = numBullets;
	}

	public int getNumLives() {
		return numLives;
	}

	public void setNumLives(int numLives) {
		this.numLives = numLives;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return isInvincible ? "P" : "p";
	}
}
