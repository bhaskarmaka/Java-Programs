package languagefundamentals;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] arr = { 10, 4, 3, 15, 1, 2 };

		int min = arr[0];
		int max = arr[0];

//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//			else if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
		for (int n : arr) {
			if (n < min) {
				min = n;
			} else if (n > max) {
				max = n;
			}
		}
		System.out.println("Min value: " + min);
		System.out.println("Max value: " + max);
	}

}
