package com.numbersloops;

public class NumbersRecursion {

	static void Numbers(int n) {
		if (n > 100) {
			return;
		}
		System.out.println(n);
		Numbers(n + 1);
	}

	public static void main(String[] args) {
		Numbers(1);
	}

}
