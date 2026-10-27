package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {9,8,7,6};
		
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			boolean swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[i]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
