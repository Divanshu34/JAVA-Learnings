package com.selfPtactise.questions;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		IsPrime obj = new IsPrime();
		Scanner s = new Scanner(System.in);
//		System.out.println(obj.isPrime(17));
//		System.out.println(obj.isPrimeOptimized(16));
//		System.out.println(obj.isPrimeMoreOptimized(16));
		
//		Primes primes = new Primes();
//		primes.findPrimes(17);
		//2, 3, 5, 7, 11, 13
		
		Tables t = new Tables();
//		int n = s.nextInt();
		System.out.println("Enter the number you want table of -> ");
		String[] arr = t.table(s.nextInt());
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
