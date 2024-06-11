package com.tnsif.assignment1;

public class AccountAbstractDemo {
	public static void main(String[] args)
	{
		SavingsAccount sa = new SavingsAccount(10000.000);
		CheckingAccount ca = new CheckingAccount(500.000);
		
		sa.deposit(4000.00);
		sa.withdraw(4000.00);
		//sa.withdraw(15000.00);
		
		ca.deposit(1200.00);
		ca.withdraw(100.00);
		//ca.withdraw(1700.00);
		
		ca.display();
		sa.display();
	}
}
