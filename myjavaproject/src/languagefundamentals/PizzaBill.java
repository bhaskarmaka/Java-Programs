package languagefundamentals;

import java.util.Scanner;

public class PizzaBill {				
		static double getpizzaPrice(char size) {
			switch(Character.toUpperCase(size)) {
			case 'S':return 70;
			case 'M':return 100;
			case 'L':return 150;
			default:return -1;
			}
		}
		
		static double calculatePizzaCost(double price,double quantity) {
			return price*quantity;
		}
		
		static double calculateDeliveryCharge(double distance) {
			if(distance>=0&&distance<=10) {
				return 70;
			}
			else if(distance<=20) {
				return 100;
			}
			else {
				return 150;
			}
		}
		
		static double calculateFinalBill(double pizzacost,double deliverycharge) {
			return pizzacost+deliverycharge;
		}
		
		public static void main(String args[]) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter size of pizza: ");
			char size=sc.next().charAt(0);
			System.out.println("Enter Quantity: ");
			double quantity=sc.nextDouble();
			System.out.println("Enter Distance: ");
			double distance=sc.nextDouble();
			
			double price=getpizzaPrice(size);
			if(price==-1) {
				System.out.println("Invalid size");
				sc.close();
			}
			if(quantity<=0) {
				System.out.println("Invalid Quantity");
				sc.close();
			}
			if(distance<0) {
				System.out.println("Invalid Distance");
				sc.close();
			}
			
			double pizzaCost=calculatePizzaCost(price,quantity);
			double deliveryCharge=calculateDeliveryCharge(distance);
			double finalBill=calculateFinalBill(pizzaCost,deliveryCharge);
			
			System.out.println("Pizza Bill: ");
			System.out.println("Pizza Size: "+Character.toUpperCase(size));
			System.out.println("Pizza price: "+price);
			System.out.println("Quantity: "+quantity);
			System.out.println("Pizza Cost: "+pizzaCost);
			System.out.println("Delivery Charge: "+deliveryCharge);
			System.out.println("---------------------------------");
			System.out.println("Finall Bill: "+finalBill);
			
		}
		
}

