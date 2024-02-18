package com.selfPtactise.questions;

public class IsPrime {
//	IsPrime ka object => obj
//	obj.isPrime()
	public boolean isPrime(int n) {
		//5
		//O(n)
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	//17
	//17/2
	//17/3
	//17/4
	
	public boolean isPrimeOptimized(int n) {
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	//25 => under root -> 5
	//25/2
	//25/3
	//25/4
	//25/5
	
	//26/2
	
	//27/2
	//27/3
	
	//28/2
	
	
	
	//29 => under root -> 5
	//29/2
	//29/3 ....29/5
	
	public boolean isPrimeMoreOptimized(int n) {
		if(n == 2 || n == 3) {
			return true;
		}
		int sqrtN = (int)Math.pow(n, 0.5);
		for(int i = 2; i <= sqrtN; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
