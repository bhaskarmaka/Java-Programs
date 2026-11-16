package com.arrays;

public class RangeElements {

	public static void main(String[] args) {
		int a[][]= {{1,6},{2,5},{0,2},{4,5}};
		
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i][0]<=a[j][0] && a[j][1]<=a[i][1]){
					flag=1;
					break;
				}
			}
			System.out.print(flag);
			if(i<a.length-1) {
				System.out.print(",");
			}
		}
	}

}
