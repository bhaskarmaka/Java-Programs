package com.numbersloops;

import java.util.Scanner;

public class NeonNum {
	
	static boolean isNeon(int n) {
		 boolean status=false;
		 int temp=n,sum=0;
		 int sq=n*n;
		 while(sq>0) {
			 int r=sq%10;
			 sum=sum+r;
			 sq=sq/10;
		 }
		 if(sum==temp) {
			 status=true;
		 }
		 
		 return status;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Nmber: ");
		int n=sc.nextInt();
		if(isNeon(n)) {
			System.out.println("Neon Number!!");
		}
		else
		{
			System.out.println("Not a Neon Number!!");
		}
	}

}
