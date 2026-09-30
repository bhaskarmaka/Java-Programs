package com.arrays;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 7, 0, 1, 4, 3, 6, 5 };
		System.out.println("Enter Tagert: ");
		int target = sc.nextInt();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}
	}
}
