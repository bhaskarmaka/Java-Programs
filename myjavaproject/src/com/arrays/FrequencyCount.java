package com.arrays;

public class FrequencyCount {

	public static void main(String[] args) {
		int[] arr= {10,20,10,20,30,10,30};
		
				
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			boolean duplicate=false;
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					duplicate=true;
					break;
				}
			}
			
			if(!duplicate) {
				System.out.println(arr[i]+" : "+count+"times");
			}
			
		}
	}
}
