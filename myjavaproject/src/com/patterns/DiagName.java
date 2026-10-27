package com.patterns;

public class DiagName {

	public static void main(String[] args) {
		String str="ROHIT";
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j||i+j==6) {
					System.out.print(str.charAt(i-1)+" ");
				}
				else {
					System.out.print((ch++)+" ");
					
				}
			}
			System.out.println();
		}
	}

}
