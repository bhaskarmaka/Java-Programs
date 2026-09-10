package languagefundamentals;

import java.util.Scanner;

public class PerfectNum {

	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		if (isPerfect(n)) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a perfect Num");
		}
	}

}
