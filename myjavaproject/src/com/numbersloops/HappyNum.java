package com.numbersloops;

import java.util.Scanner;

public class HappyNum {
	static int isHappy(int n) {
		while (n != 1 && n != 4) {
			int sum=0;
			while (n > 0) {
				int r = n % 10;
				int sq = r * r;
				n = n / 10;
				sum = sum + sq;
			}
			n=sum;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n = sc.nextInt();
		n=isHappy(n);
		if (n==1) {
			System.out.println("Happy Number!!");
		} else {
			System.out.println("Not a Happy Num");
		}
	}

}
