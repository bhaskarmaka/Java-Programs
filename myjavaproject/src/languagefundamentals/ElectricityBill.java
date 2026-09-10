package languagefundamentals;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Connection Type: ");
		String type = sc.next().toLowerCase();
		System.out.println("Enter no.of units consumed: ");
		int units = sc.nextInt();
		int rate = 0;
		switch (type) {
		case "domestic" -> {
			if (units <= 300) {
				rate = 2;
			} else {
				rate = 3;
			}

		}
		case "commercial" -> {
			if (units <= 100) {
				rate = 4;
			} else if (units <= 300) {
				rate = 6;
			} else {
				rate = 8;
			}
		}
		default -> System.out.println("Invalid Connection Type");
		}
		int bill = units * rate;
		
		System.out.println("Connection Type: " + type);
		System.out.println("Units Consumed: " + units);
		System.out.println("Rate per unit: " + rate);
		System.out.println("Total Electricity Bill: " + bill);

	}

}
