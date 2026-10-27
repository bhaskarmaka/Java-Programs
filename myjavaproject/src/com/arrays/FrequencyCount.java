package com.arrays;

public class FrequencyCount {

	public static void main(String[] args) {
		int[] arr= {1,3,1,5,7,5,5,7};
		
				
		for(int i=0;i<arr.length;i++) {
			int count=1;
			boolean duplicate=false;
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					duplicate=true;
					break;
				}
			}
			if(duplicate) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i]+" : "+count+"times");
//			if(!duplicate) {
//				System.out.println(arr[i]+" : "+count+"times");
//			}
			
		}
	}
}
