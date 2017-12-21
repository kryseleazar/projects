package com.problem.machine.xyz.objects;

public class LetterZ extends Letter {

	public LetterZ(int scale) {
		super(scale);
	}

	@Override
	public char[][] plotLetter() {

		super.plotCenter();

		plotUpperBar();
		plotLowerBar();
		plotRightStem();
		plotLeftStem();

		return getOutput();
	}

	private void plotUpperBar() {

		int j = 0;

		for (int i = 0; i < getOutput().length - 1; i++) {

			getOutput()[j][i] = '*';

		}

	}

	private void plotLowerBar() {

		int j = getOutput().length - 1;

		for (int i = 1; i < getOutput().length; i++) {

			getOutput()[j][i] = '*';

		}

	}

	private void plotLeftStem() {

		int row = getRow();
		int col = getCol();

		while (col > 0) {
			row += 1;
			col -= 1;
			getOutput()[row][col] = '*';
		}

	}

	private void plotRightStem() {

		int row = getRow();
		int col = getCol();

		while (col < getOutput().length - 1) {
			row -= 1;
			col += 1;
			getOutput()[row][col] = '*';
		}

	}

}
