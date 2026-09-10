package languagefundamentals;

import java.util.Scanner;

public class PrimeArray {

	static boolean isPrime(int a) {

		boolean status = true;
		if (a == 0 || a == 1) {
			status = false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				status = false;
			}
		}
		return status;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int a : arr) {
			if (isPrime(a)) {
				System.out.println(a);
			}
		}
	}

}
