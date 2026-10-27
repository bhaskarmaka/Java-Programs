package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrRightToLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println("Enter how many positions you want to rotate: ");
		int r = sc.nextInt();

		rotateArray(arr, r);

		System.out.println(Arrays.toString(arr));
	}

	static void rotateArray(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;
		r=r%arr.length;

		reverseArray(arr, start, end);// reverse whole array

		reverseArray(arr, start, r - 1);// reverse 1st half
		
		reverseArray(arr, r, end);//reverse 2nd half
	}

	static void reverseArray(int[] arr, int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
