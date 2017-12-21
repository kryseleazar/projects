package com.problem.machine.xyz.objects;

public class LetterX extends Letter {

	public LetterX(int scale) {
		super(scale);
	}

	@Override
	public char[][] plotLetter() {

		super.plotCenter();

		plotRightLeg();
		plotLeftLeg();
		plotLeftArm();
		plotRightArm();

		return getOutput();

	}

	private void plotLeftLeg() {

		int row = getRow();
		int col = getCol();

		while (col > 0) {
			row += 1;
			col -= 1;
			getOutput()[row][col] = '*';
		}

	}

	private void plotRightLeg() {

		int row = getRow();
		int col = getCol();

		while (col < getOutput().length - 1) {
			row += 1;
			col += 1;
			getOutput()[row][col] = '*';
		}
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

}
