package com.problem.machine.xyz.objects;

import com.problem.machine.xyz.LetterUtil;

public abstract class Letter {

	private int row;

	private int col;

	private char[][] output;

	protected Letter(int scale) {
		this.output = new char[scale][scale];
		this.row = LetterUtil.calculateCenter(scale);
		this.col = LetterUtil.calculateCenter(scale);
	}

	public abstract char[][] plotLetter();

	protected void plotCenter() {

		getOutput()[getRow()][getCol()] = '*';

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

	public char[][] getOutput() {
		return output;
	}

	public void setOutput(char[][] output) {
		this.output = output;
	}

}
