package com.arrays;

public class SumNdProduct {

	public static void main(String[] args) {
		
		int[] arr= {5,9,4,1,3};
		
		int sum=0,prod=1;
		
		for(int a:arr) {
			sum+=a;
			prod*=a;
		}
		System.out.println("Sum of Array: "+sum);
		System.out.println("Product of Array: "+prod);
	}
}
