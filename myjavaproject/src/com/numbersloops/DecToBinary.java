package com.numbersloops;

import java.util.Scanner;

public class DecToBinary {

	static void convertBinary(int n) {
		String str="";
		while(n>0) {
			int r=n%2;
			n=n/2;
			str=r+str;
		}
		System.out.println("Binary value: "+str);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n=sc.nextInt();
		convertBinary(n);
	}

}
