package languagefundamentals;

public class NumbersRecursion {

	static void primeNumbers(int n) {
		if (n > 100) {
			return;
		}
		System.out.println(n);
		primeNumbers(n + 1);
	}

	public static void main(String[] args) {
		primeNumbers(1);
	}

}
