package com.arrays;

import java.util.Arrays;

public class MoveZeroToLeft {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0 };

		int index = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
