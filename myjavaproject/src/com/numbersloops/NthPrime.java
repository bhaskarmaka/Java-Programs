package com.numbersloops;

import java.util.Scanner;

public class NthPrime {
	static boolean isPrime(int n) {
		boolean status = true;
		if(n<2){
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which prime number u want: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1;count<=n; i++) {
			if (isPrime(i)) {
				count++;
				if (count == n) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
