package com.selfPtactise.questions;

public class Primes {
	//m=10 
	//15 -> 2, 3, 4, 5, 6, 7, 8, 9
	//2, 3, 5, 7, 9
	public void findPrimes(int m) {
		IsPrime obj = new IsPrime();
		for(int i = 2; i <= m; i++) {
			boolean isPrime = obj.isPrimeMoreOptimized(i);
			if(isPrime == true) {
				System.out.println(i);
			}
		}
	}
}
