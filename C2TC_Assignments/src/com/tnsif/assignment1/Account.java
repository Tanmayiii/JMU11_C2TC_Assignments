package com.tnsif.assignment1;

public abstract class Account {
	
	public double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	abstract void deposit(double balance);
	
	abstract void withdraw(double balance);
	
	abstract double getBalance();
	
	void display() {
		System.out.println("Available balance:"+getBalance());
	}
}
