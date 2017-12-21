package com.problem.machine.xyz;

public abstract class LetterGenerator {

	private StringBuilder letterBoard;
	
	private int orientation;
	
	protected LetterGenerator(int orientation) {
		this.orientation = orientation;
	}
	
	public abstract void plotToConsole(int scale, String[] letters);

	public StringBuilder getLetterBoard() {
		return letterBoard;
	}

	public void setLetterBoard(StringBuilder letterBoard) {
		this.letterBoard = letterBoard;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	
}
