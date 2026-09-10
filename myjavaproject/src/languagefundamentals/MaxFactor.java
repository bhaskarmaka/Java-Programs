package languagefundamentals;

import java.util.Scanner;

public class MaxFactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n=sc.nextInt();
		for(int i=n/2;i>=1;i--) {
			if(n%i==0) {
				System.out.println("Maximum Factor: "+i);
				break;
			}
		}
		
		
	}

}
