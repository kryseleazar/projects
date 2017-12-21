package com.problem.machine;

import com.problem.machine.xyz.objects.Letter;

public interface Factory {

	public Letter getLetter(String letter, int scale);
	
}
