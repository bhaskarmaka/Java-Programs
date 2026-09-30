package com.numbersloops;

import java.util.Scanner;

public class MultiplicationTable {
	static void Table(int n,int n1) {
		for(int i=1;i<=n1;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which table u want: ");
		int n=sc.nextInt();
		System.out.println("Enter how many steps u want: ");
		int n1=sc.nextInt();
		Table(n,n1);
	}

}
