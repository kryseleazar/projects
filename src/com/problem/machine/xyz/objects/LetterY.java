package com.problem.machine.xyz.objects;

public class LetterY extends Letter {

	public LetterY(int scale) {
		super(scale);
	}

	@Override
	public char[][] plotLetter() {

		super.plotCenter();

		plotLeftArm();
		plotRightArm();
		plotTail();

		return getOutput();
	}

	private void plotLeftArm() {

		int row = getRow();
		int col = getCol();

		while (col > 0) {
			row -= 1;
			col -= 1;
			getOutput()[row][col] = '*';
		}

	}

	private void plotRightArm() {

		int row = getRow();
		int col = getCol();

		while (col < getOutput().length - 1) {
			row -= 1;
			col += 1;
			getOutput()[row][col] = '*';
		}

	}

	private void plotTail() {

		int row = getRow();
		int col = getCol();

		while (row < getOutput().length - 1) {
			row += 1;
			getOutput()[row][col] = '*';
		}

	}

}
