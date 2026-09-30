package com.numbersloops;

import java.util.Scanner;

public class EvenDigitPlaceSum {
	static int EvnposSum(int n) {
		int sum = 0;
		int n1 = n;
		int r = 0, count = 0;

		while (n1 > 0) {
			n1 = n1 / 10;
			count++;
		}

		while (n > 0) {
			r = n % 10;
			if (count % 2 != 0) {
				sum += r;
			}
			count--;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n = sc.nextInt();
		int sum = EvnposSum(n);
		System.out.println("Even Position Sum: " + sum);
	}

}
