package languagefundamentals;

import java.util.Scanner;

public class NthPerfectNum {

	static boolean isPerfect(int n) {
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum+=i;
				}
			}
		return sum==n;
		}

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int count=0;
			System.out.println("Enter a Number: ");
			int n=sc.nextInt();
			for (int n1 = 1; n1 <= 100; n1++) { 
				if (isPerfect(n1)) {
					count++;
					if (count == 2) {
						System.out.println("2nd Perfect Number: " + n1);
						break;
				}
			}
		}
		}

	}
