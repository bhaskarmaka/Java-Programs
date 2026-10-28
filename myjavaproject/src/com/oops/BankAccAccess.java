package com.oops;

public class BankAccAccess {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.setAccountHolderName("Alice");
		b1.setBalance(5000);
		
		System.out.println(b1.getAccountHolderName());
		System.out.println(b1.getBalance());
	}
}
