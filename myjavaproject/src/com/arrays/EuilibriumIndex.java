package com.arrays;

public class EuilibriumIndex {

	public static void main(String[] args) {
		int[] arr= {1,3,5,2,2};
		
		int left_sum=0,tot_sum=0;
		
		for(int a:arr) {
			tot_sum+=a;
		}
		for(int i=0;i<arr.length;i++) {
			tot_sum-=arr[i];
			
			if(left_sum==tot_sum) {
				System.out.println("Index: "+i);
				System.out.println("Element: "+arr[i]);
			}
			left_sum+=arr[i];
		}
	}
}
