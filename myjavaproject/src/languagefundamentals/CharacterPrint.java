package languagefundamentals;

import java.util.Scanner;

public class CharacterPrint {

	static void findChar(int n) {
		if(n>0&&n<=26) {
			char ch=(char) ('A' + (n - 1));
			System.out.println(ch);
		}
		else {
			System.out.println("Invalid Num!!");
		
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n=sc.nextInt();
		findChar(n);
	}
}
