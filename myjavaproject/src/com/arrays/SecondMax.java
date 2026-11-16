package com.arrays;

public class SecondMax {

	public static void main(String[] args) {

		int[] arr = { 1,3,4,5,3,5};

		int max = Integer.MIN_VALUE;
		int sec_max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				sec_max = max;
				max = arr[i];
			}else if (arr[i] > sec_max && arr[i] != max) {
				sec_max = arr[i];
			} 
		}
		System.out.println("Max value: "+max);
		System.out.println("Second Max value: "+sec_max);
	}

}
