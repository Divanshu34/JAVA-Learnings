package com.jnkvv.maths;

public class Factorial {
	public int factorial(int n) {
		int prod = 1;
		for(int i = n; i > 1; i--) {
			prod = prod * i;
		}
		
		return prod;
	}
}
