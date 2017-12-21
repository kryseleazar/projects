package com.problem.machine.xyz;

import com.problem.machine.Factory;
import com.problem.machine.xyz.objects.Const;
import com.problem.machine.xyz.objects.Letter;
import com.problem.machine.xyz.objects.LetterX;
import com.problem.machine.xyz.objects.LetterY;
import com.problem.machine.xyz.objects.LetterZ;

public class LetterFactory implements Factory, Const {

	@Override
	public Letter getLetter(String ltr, int scale) {

		Letter letter = null;

		switch (ltr.toUpperCase()) {

		case LETTER_X:
			letter = new LetterX(scale);
			break;

		case LETTER_Y:
			letter = new LetterY(scale);
			break;

		case LETTER_Z:
			letter = new LetterZ(scale);
			break;

		default:
			break;

		}

		return letter;
	}

}
