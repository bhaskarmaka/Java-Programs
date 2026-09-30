package com.languagefundamentals;

import java.util.Scanner;

public class NthFibonacci {

	static int fibonacci(int n) {
		int n1 = 0, n2 = 1,n3=0;
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		for (int i = 2; i <= n; i++) {
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
			return n3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which num u want..?");
		int n = sc.nextInt();
		int fib=fibonacci(n);
		System.out.println(n+"th Fibonacci number is: "+fib);
	}
}
