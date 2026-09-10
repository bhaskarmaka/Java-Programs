package languagefundamentals;

import java.util.Scanner;

public class SwapBitwise {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b values: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("A value before: "+a);
		System.out.println("B value before: "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("A value after: "+a);
		System.out.println("B value after: "+b);
	}

}
