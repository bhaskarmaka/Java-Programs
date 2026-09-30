package com.numbersloops;

import java.util.Scanner;

public class BinaryToDec {

	static void covertDecimal(int n) {
		int temp = n, n1 = n, digits = 0, dec = 0;

		while (n1 > 0) {
			n1 = n1 / 10;
			digits++;
		}

		while (n > 0) {
			int r = n % 10;
			dec = dec + r * (int) Math.pow(2, digits-1);
			n = n / 10;
			digits--;
		}
		System.out.println(dec);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n = sc.nextInt();
		covertDecimal(n);
	}

}
