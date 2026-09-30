package com.arrays;

public class RoundOff {

	public static void main(String[] args) {
		int[] arr = { 36, 45, 78, 66, 99 };

//		for(int n:arr) {
//			int r=n%10;
//			int value;
//			if(r>5) {
//				int add=10-r;
//				value=n+add;
//			}
//			else {
//				value=n-r;
//			}
//			System.out.print(value+" ");
//		}

		for (int n : arr) {
			if (lastDigit(n) > 5) {
				System.out.println(n + (10 - lastDigit(n)));
			} else {
				System.out.println(n - lastDigit(n));
			}
		}
	}

	static int lastDigit(int n) {
		return n % 10;
	}
}
