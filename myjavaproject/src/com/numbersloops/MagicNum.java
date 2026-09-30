package com.numbersloops;

import java.util.Scanner;

public class MagicNum {
	static boolean magicNum(int n) {
		int r=0;
		while(n>9) {
			int sum=0;
			while(n>0) {
				r=n%10;
				sum+=r;
				n=n/10;
			}
			n=sum;
		}
		return n==1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n=sc.nextInt();
		if(magicNum(n)) {
			System.out.println("Magic  Numebr");
		}
		else {
			System.out.println("Not a Magic Number");
		}
	}

}
