package com.numbersloops;

import java.util.Scanner;

public class Nprimes {
	static boolean isPrime(int n) {
		boolean status=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many prime numbers u want: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
