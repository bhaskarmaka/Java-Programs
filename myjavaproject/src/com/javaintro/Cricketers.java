package com.javaintro;

public class Cricketers {
	String cricketerName;
	int jerseyNo;
	int age;
	
	static String countryName;
	static String boardName;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countryName="India";
		boardName="BCCI";
//		System.out.println(countryName);
//		System.out.println(Cricketers.countryName);
		Cricketers c1=new Cricketers();
//		System.out.println(c1.countryName);
		c1.cricketerName="Hardik pandya";
		c1.jerseyNo=33;
		c1.age=32;
		System.out.println("Cricketer Name: "+c1.cricketerName);
		System.out.println("Jersey No: "+c1.jerseyNo);
		System.out.println("Age: "+c1.age);
		System.out.println("Country: "+countryName);
		System.out.println("Board: "+boardName);
		
		Cricketers c2=new Cricketers();
		c2.cricketerName="Rohit sharma";
		c2.jerseyNo=45;
		c2.age=39;
		System.out.println("Cricketer Name: "+c2.cricketerName);
		System.out.println("Jersey No: "+c2.jerseyNo);
		System.out.println("Age: "+c2.age);
		System.out.println("Country: "+countryName);
		System.out.println("Board: "+boardName);
		
	}

}
