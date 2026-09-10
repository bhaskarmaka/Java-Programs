package languagefundamentals;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];

		arr[0][0] = 10;
		arr[1][1] = 100;
		arr[2][2] = 200;

//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);

//		for (int[] a1 : arr) {
//			for (int a : a1) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
