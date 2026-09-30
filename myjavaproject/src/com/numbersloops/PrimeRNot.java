package com.numbersloops;

import java.util.Scanner;

public class PrimeRNot {
	static boolean isPrime(int n) {
		int count=0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if(count==2)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num to check prime r not");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is Prime");
		} else {
			System.out.println(n + " is not Prime");
		}
	}

}
