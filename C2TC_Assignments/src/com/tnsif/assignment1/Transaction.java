package com.tnsif.assignment1;

public class Transaction {
	
	final static float transactionFee = 30.00f;
	
	public final void performtransac() {
		System.out.println("Performing transaction....");
	}
	
	public static void main(String[] args) {
		Transaction t1 = new Transaction();
		t1.performtransac();
		System.out.println("Your transaction fee is:"+transactionFee);
	}
}