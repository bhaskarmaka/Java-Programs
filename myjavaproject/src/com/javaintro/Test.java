package com.javaintro;

public class Test {
//	void hello() {
//		System.out.println("Hello");
//	}
//	
//	static void welcome() {
//		System.out.println("Welcome");
//	}
	static Test t=new Test();
	static{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance block");
		Test t=new Test();
	}
	
	public static void main(String argS[]) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		System.out.println("Main method ended");
	}

}
