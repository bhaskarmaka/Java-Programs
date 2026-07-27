package com.javaintro;

public class Movie {
	String movieName;
	int releasedYear;
	int ticketPrice;
	
	void display() {
		System.out.println("Movie Name: "+movieName);
		System.out.println("Released Year: "+releasedYear);
		System.out.println("Ticket Price: "+ticketPrice);
	}
	public static void main(String[] args) {
		Movie m1=new Movie();
		m1.movieName="OG";
		m1.releasedYear=2025;
		m1.ticketPrice=1000;
		
		Movie m2=new Movie();
		m2.movieName="Peddi";
		m2.releasedYear=2026;
		m2.ticketPrice=700;
		
		Movie m3=new Movie();
		m3.movieName="Lenin";
		m3.releasedYear=2026;
		m3.ticketPrice=250;
		
		m1.display();
		m2.display();
		m3.display();
		

	}

}
