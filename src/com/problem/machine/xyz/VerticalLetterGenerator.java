package com.problem.machine.xyz;

import com.problem.machine.Factory;
import com.problem.machine.xyz.objects.Letter;

public class VerticalLetterGenerator extends LetterGenerator {

	protected VerticalLetterGenerator(int orientation) {
		super(orientation);
	}

	@Override
	public void plotToConsole(int scale, String[] letters) {

		Factory ltrFactory = new LetterFactory();
		for (String letter : letters) {

			Letter ltrToPlot = ltrFactory.getLetter(letter, scale);
			char[][] output = ltrToPlot.plotLetter();

			for (int row = 0; row < scale; row++) {

				for (int col = 0; col < scale; col++) {

					System.out.print(output[row][col]);

				}
				System.out.println();
			}
			System.out.println();
		}

	}
	
}
