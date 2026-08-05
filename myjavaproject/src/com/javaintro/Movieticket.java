package com.javaintro;

public class Movieticket {
	
	String movieName;
	int seatNum;
	boolean booked;
	
	static String theatreName="Mahalakshmi";
	
	void bookTicket() {
		booked=true;
	}
	
	void cancelTicket() {
		booked=false;
	}
	
	void displayTicketDetails() {
		System.out.println();
		System.out.println("Movie Name: "+movieName);
		System.out.println("Seat Number: "+seatNum);
		System.out.println("Ticket Status: "+booked);
	}
	
	static void changeTheatreName() {
		theatreName="Avg Cinemas";
	}
	
	static void displayTheatre() {
		System.out.println("Theatre Name: "+theatreName);
	}
	
	public static void main(String[] args) {
		Movieticket m1=new Movieticket();
		Movieticket m2=new Movieticket();
		m1.movieName="Spider Man";
		m1.seatNum=19;
		m1.booked=false;
		
		m2.movieName="OG";
		m2.seatNum=20;
		m2.booked=true;
		
		m1.displayTicketDetails();
		m2.displayTicketDetails();
		
		m1.bookTicket();
		m2.cancelTicket();
		
		m1.displayTicketDetails();
		m1.displayTheatre();
		
		m2.displayTicketDetails();
		m2.displayTheatre();
		
		m1.changeTheatreName();
		
		m1.displayTicketDetails();
		m1.displayTheatre();
		
		m2.displayTicketDetails();
		m2.displayTheatre();
				
	}

}
