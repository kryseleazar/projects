package com.problem.machine.xyz;

import java.util.ArrayList;

import com.problem.machine.Factory;
import com.problem.machine.xyz.objects.Letter;

public class HorizontalLetterGenerator extends LetterGenerator {
	
	protected HorizontalLetterGenerator(int orientation) {
		super(orientation);
	}

	@Override
	public void plotToConsole(int scale, String[] letters) {
		
		Factory ltrFactory = new LetterFactory();
		ArrayList<char[][]> listOfOutputs = new ArrayList<char[][]>();
		for (String letter : letters) {

			Letter ltrToPlot = ltrFactory.getLetter(letter, scale);
			char[][] output = ltrToPlot.plotLetter();
			
			listOfOutputs.add(output);
		}
		
		
		
		for (int row = 0; row < scale; row++) {
			
			for (char[][] output : listOfOutputs) {
				
				appendCharacter(output, scale, row);
				
			}
			
		}
		
	}
	
	private String appendCharacter(char[][] output, int scale, int row) {
		
		for (int col = 0; col < output.length; col++) {
//			output[row][col];
		}
		
		
		return null;
	}
	
}
