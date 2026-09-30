package com.numbersloops;

import java.util.Scanner;

public class ArmstrongWithoutPredefinedFunc {
	
	static boolean isArmStrong(int n) {
		boolean status=false;
		int r=0,sum=0,digitCount=0,temp=n,n1=n;
		
		while(n1>0) {
			n1/=10;
			digitCount++;
		}
				
		while(n>0) {
			r=n%10;
			int power=1;
			
			for(int i=1;i<=digitCount;i++) {
				power=power*r;
			}
			sum+=power;
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
		if(isArmStrong(n)) {
			System.out.println("Armstrong Number!!");
		}
		else {
			System.out.println("Not an Armstrong Number!!");
		}
	}

}
