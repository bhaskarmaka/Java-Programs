package com.javaintro;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Hello");
		System.out.println(Class.forName("com.javaintro.HelloWorld"));
		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
	}

}