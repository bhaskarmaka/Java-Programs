package com.arrays;

import java.util.Arrays;

public class Merge2Arr {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4};
		int[] b1= {5,6,7};
		
		int[] c1=new int[a1.length+b1.length];
		
		for(int i=0;i<a1.length;i++) {
			c1[i]=a1[i];
		}
		
		for(int i=0;i<b1.length;i++) {
			c1[a1.length+i]=b1[i];
		}
		
		System.out.println(Arrays.toString(c1));
	}

}
