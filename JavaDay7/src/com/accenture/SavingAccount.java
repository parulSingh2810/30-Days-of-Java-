package com.accenture;

public class SavingAccount {

	// instance variable
	float balance = 1000f;

	// method to withdraw the amount from Saving Account
	//Note - Add synchronization in method signature to show the example of synchronization
	public synchronized void withdraw(float amount) {
		if (amount < 0 || amount > balance) {
			throw new IllegalArgumentException("Can not withdaw amount");
		}
		else if (amount <= balance) {
			System.out.println(Thread.currentThread().getName() + "Withdraw money");
			balance = balance - amount;
			System.out.println("Balance" + balance);
		}
		
	}

	// method to deposit the amount into Saving Account
	//Note - Add synchronization in method signature to show the example of synchronization
	public void deposit(float amount) {
		if (amount < 0) {
			
			throw new IllegalArgumentException("Can not withdaw negative amount");
		}
		balance = balance + amount;

	}
}
