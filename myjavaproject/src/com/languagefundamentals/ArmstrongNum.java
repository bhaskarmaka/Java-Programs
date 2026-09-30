package com.languagefundamentals;

import java.util.Scanner;

public class ArmstrongNum {

	static boolean isArmstrong(int n) {
		boolean status=false;
		int r=0,n1=n,temp=n,sum=0,digitCount=0;
		
//		String str=Integer.toString(n);
//		int digitCount=str.length();
		
		while(n1>0) {
			n1=n1/10;
			digitCount++;
	}
		
		while(n>0) {
			r=n%10;
			sum+=(int)Math.pow(r,digitCount);
			n=n/10;
		}
		if(temp==sum) {
			status=true;
		}
		return status;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n=sc.nextInt();
		if(isArmstrong(n)){
			System.out.println("Armstrong Number!!");
		}
		else {
			System.out.println("Not an Armstrong Number!!");
		}
	}

}
