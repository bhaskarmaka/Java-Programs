package com.arrays;

public class MissingNums {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 9, 11 };

		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i + 1] - arr[i];

			while (temp > 1) {
				System.out.println(arr[i + 1] - temp + 1);
				temp--;
			}
		}
	}
}
