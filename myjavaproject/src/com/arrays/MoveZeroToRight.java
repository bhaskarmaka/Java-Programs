package com.arrays;

import java.util.Arrays;

public class MoveZeroToRight {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0 };

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
