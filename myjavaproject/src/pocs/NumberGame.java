package pocs;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r= new Random();
		int n=r.nextInt(1,11);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter a number to Guess: ");
			int num=sc.nextInt();
			if(num==n) {
				System.out.println("You WON!!");
				break;
			}
			else if (i == 3) {
			    System.out.println("BETTER LUCK NEXT TIME");
			}
			else {
				System.out.println("Wrong Guess Try Again");
			}
		}
		
	}

}
