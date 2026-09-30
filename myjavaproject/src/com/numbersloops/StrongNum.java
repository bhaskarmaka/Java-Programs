package com.numbersloops;

import java.util.Scanner;

public class StrongNum {
	static int factorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;	
		}
		return fact;
	}
	static void factSum(int n) {
		int sum=0;
		int org=n;
		for(;n>0;n=n/10) {
			int r=n%10;
			int fn=factorial(r);
			sum=sum+fn;
		}
		if(sum==org) {
			System.out.println(org+" is Strong Number");
		}
		else {
			System.out.println(org+" is not a Strong Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int n=sc.nextInt();
		factSum(n);
		
	}

}
