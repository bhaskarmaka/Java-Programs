package com.numbersloops;

import java.util.Scanner;

public class EvenCount {
	static void evenCount(int n) {
		int count = 0;
		for (; n > 0; n = n / 10) {
			int r = n % 10;
			if (r % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int n = sc.nextInt();
		evenCount(n);
	}
}
