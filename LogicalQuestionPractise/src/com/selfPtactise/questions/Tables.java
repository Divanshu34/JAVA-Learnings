package com.selfPtactise.questions;

public class Tables {
	public String[] table(int n) {
		String[] arr = new String[10];
		for (int i = 1; i <= 10; i++) {
			String s = n+" × "+i+" = "+n*i;
			arr[i-1] = s;
		}
		return arr;
	}
}
