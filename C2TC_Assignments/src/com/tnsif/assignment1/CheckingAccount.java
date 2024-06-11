package com.tnsif.assignment1;

public class CheckingAccount extends Account{

	public CheckingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double amt) {
		balance += amt;
		System.out.println("Amount deposited");
		
	}

	@Override
	void withdraw(double amt) {
		if (amt<=balance){
			balance -= amt;
			System.out.println("Withdrawal successful");
		}
		if (amt>balance) {
			System.out.println("Invalid withdrawal amount");
		}
	}

	@Override
	double getBalance() {
		return balance;
	}
	
}
