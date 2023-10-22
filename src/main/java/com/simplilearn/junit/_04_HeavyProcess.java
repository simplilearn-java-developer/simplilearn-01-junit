package com.simplilearn.junit;

public class _04_HeavyProcess {

	static int process() {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < 1_000_000; i++) {
			
			if (i > max) {
				max = i;
			}
			
		}
		
		return max;
	}
}
