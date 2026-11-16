package com.patterns;

public class PascalTriangle {

	public static void main(String[] args) {
		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int space=0;space<rows-i-1;space++) {
				System.out.print(" ");
			}
			int val=1;
			for(int j=0;j<=i;j++) {
				System.out.print(val+" ");
				val=val*(i-j)/(j+1);
			}
			System.out.println();
		}

	}
}
