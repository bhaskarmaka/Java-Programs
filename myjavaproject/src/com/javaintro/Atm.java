package com.javaintro;

public class Atm {
	
	static String bankName="SBI";
	int accountNum;
	double balance;
	
	void deposit(double amount) {
		System.out.println("Deposited: "+amount);
		balance+=amount;
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawed: "+amount);
		}
		else {
			System.out.println("Insufficient funds...");
		}
	}
	void checkBal() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("Account Num: "+accountNum);
		System.out.println("Balance :"+balance);
	}
	
	public static void main(String[] args) {
		Atm a1=new Atm();
		a1.accountNum=1001;
		a1.balance=5000;
		
		Atm a2=new Atm();
		a2.accountNum=1002;
		a2.balance=10000;
		
		a1.deposit(1000);
		a1.withdraw(2000);
		a2.deposit(3000);
		a2.withdraw(2000);
		
		System.out.println("Account 1 Details:");
		a1.checkBal();
		System.out.println("Account 2 Details:");
		a2.checkBal();

	}

}
