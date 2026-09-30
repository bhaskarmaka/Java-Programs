package com.arrays;

public class MostFreqNum {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 0, 0, 1, 0 };

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > arr.length / 2) {

				System.out.println("Frequently Occurred Num: " + arr[i]);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No element");
		}
	}
}