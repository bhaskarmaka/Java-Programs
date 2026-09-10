package languagefundamentals;

import java.util.Arrays;

public class RevArray {

	public static void main(String[] args) {
		int[] arr= {9,8,7,6,5,4,3,2,1,0};
		
		//using for loop
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		//using two pointers
		int temp=0;
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for (int num : arr) {
	            System.out.print(num + " ");
	    }
	}
}
