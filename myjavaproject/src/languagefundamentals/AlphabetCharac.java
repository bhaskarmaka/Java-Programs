package languagefundamentals;

public class AlphabetCharac {

	public static void main(String[] args) {
		for (int i = 1; i <= 26; i++) {
			if (i % 2 == 0) {
				char ch = (char) ('A' + (i - 1));
				System.out.println(i + "->" + ch);
			}
		}
	}
}
