package com.numbersloops;

import java.util.Scanner;

public class AutomorphicNum {

	static void automorphicNum(int n){
		int temp=n,div=1,sq=n*n,count=0;
		
		while(n>0) {
//			div=div*10;
			n=n/10;
			count++;
		}
//		if(sq%div==temp) {
//			System.out.println("Automorphic Number");
//		}
		int divisor=(int) Math.pow(10, count);
		if(sq%divisor==temp) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not an Automorphic Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n=sc.nextInt();
		automorphicNum(n);
	}

}
