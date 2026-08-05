package com.javaintro;

public class ShoppingCart {
	
	int items;
	double totalAmount;
	String orderPlaced;
	
	static String website="Dominos Pizza";
	
	void addItem() {
		items++;
		totalAmount+=250;
	}
	
	void placeOrder() {
		orderPlaced="Ordered Placed";
	}
	
	void cancelOrder() {
		orderPlaced="Order Cancelled";
	}
	
	void displayCart() {
		System.out.println();
		System.out.println("Website Name: "+website);
		System.out.println("Items: "+items);
		System.out.println("Total Amount: "+totalAmount);
		System.out.println("Order Status: "+orderPlaced);
	}
	
	static void changeWebsite() {
		website="Pizza Hut";
	}
	
	static void displayWebsite() {
		System.out.println("Website Name: "+website);
	}
	public static void main(String[] args) {
		ShoppingCart c1=new ShoppingCart();
		ShoppingCart c2=new ShoppingCart();
		c1.items=2;
		c1.totalAmount=500;
		c1.orderPlaced="No";
		
		c2.items=4;
		c2.totalAmount=1000;
		c2.orderPlaced="Yes";
		
		c1.displayCart();
		c2.displayCart();
		
		c1.placeOrder();
		c2.addItem();
		
		changeWebsite();
		
		c1.displayCart();
		c2.displayCart();
		
		
	}

}
