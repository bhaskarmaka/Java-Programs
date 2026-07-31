package com.javaintro;

public class Restuarant {
	
	int tableNum,seats;
	String reserved;
	
	static String restuarantName="Mehfil";
	
	void reserveTable() {
		reserved="Reserved";
		System.out.println("Table reserved: "+tableNum);
		System.out.println("Table status of "+tableNum+" : "+reserved);
		System.out.println();
	}
	
	void cancelReservation() {
		reserved="Not reserved";
		System.out.println("Reservation Cancelled for Table Num: "+tableNum);
		System.out.println();
	}
	
	void displayDetails() {
		System.out.println("Restuarant Name: "+restuarantName);
		System.out.println("Table Number: "+tableNum);
		System.out.println("Seating Capacity: "+seats);
		System.out.println("Table status: "+reserved);
		System.out.println();
	}
	
	static void changeRestuarantName() {
		restuarantName="Andhra House";
	}
	
	static void displayRestuarantName() {
		System.out.println("Restuarant Name: "+restuarantName);
	}
	
	
	public static void main(String[] args) {
		Restuarant r1=new Restuarant();
		Restuarant r2=new Restuarant();
		
		r1.tableNum=101;
		r1.seats=5;
		r1.reserved="Not Reserved";
		
		r2.tableNum=102;
		r2.seats=10;
		r2.reserved="Reserved";
		
		r1.displayDetails();
		r2.displayDetails();
		
		r1.reserveTable();
		r2.cancelReservation();
		
		r1.displayDetails();
		r2.displayDetails();
		
		
	}

}
