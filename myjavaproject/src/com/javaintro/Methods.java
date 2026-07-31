package com.javaintro;

public class Methods {
	static void method1(){
		method2();
		System.out.println("Method1 called");
	}
	static void method2() {
		Methods m=new Methods();
		m.method3();
		System.out.println("Method2 called");
	}
	void method3() {
		method4();
		System.out.println("Method3 called");
	}
	static void method4() {
		System.out.println("Method4 called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method called");
		method1();
		System.out.println("Main method ended");
	}

}
