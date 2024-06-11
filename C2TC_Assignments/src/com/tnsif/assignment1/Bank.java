package com.tnsif.assignment1;

public class Bank {
	//creating a static variable to keep track of total Bank accounts
	static private int totalAccounts = 0;
	
	public Bank() {
		totalAccounts ++;
	}
	
	//creating a static method to return total number of bank accounts
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
}

