package com.tnsif.assignment1;

public class BankExecutor {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Bank b3 = new Bank();
		
		//display total number of bank accounts
		System.out.println("Total number of accounts:" +Bank.getTotalAccounts());

	}
}
