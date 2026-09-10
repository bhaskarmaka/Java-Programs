package languagefundamentals;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur Age: ");
		int age=sc.nextInt();
		
		
		if(age>=18) {
			System.out.println("Enter ur Gender: ");
			char gender=sc.next().toUpperCase().charAt(0);
			
			
			if(gender=='M'||gender=='F') {
				System.out.println("Enter ur VoterID: ");
				int voterID=sc.nextInt();
				
				System.out.println("Candidates List: ");
				System.out.println("1-->JSP");
				System.out.println("2-->BJP");
				System.out.println("3-->TDP");
				System.out.println("4-->YSRCP");
				System.out.println("Press any opt to vote");
				int opt=sc.nextInt();
				switch(opt) {
				case 1 -> System.out.println("Vote is Captured for JSP");
				case 2 -> System.out.println("Vote is Captured for BJP");
				case 3 -> System.out.println("Vote is Captured for TDP");
				case 4 -> System.out.println("Vote is Captured for YSRCP");
				default-> System.out.println("Thanks for Voting to NOTA");
				}
			}
			else {
				System.out.println("Not Eligible");
			}
		}
		else {
			System.out.println("Not Eligible");
		}
	}

}
