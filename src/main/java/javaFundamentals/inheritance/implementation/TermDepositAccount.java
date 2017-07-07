package javaFundamentals.inheritance.implementation;

public class TermDepositAccount extends Account {
	public double calculateInterest(double amount) {
		// calculate interest for SavingsAccount
		return amount * 0.05;
	}

	public void deposit(double amount) {
		super.deposit(amount); // get code reuse
		// do something else
	}

	public void withdraw(double amount) {
		super.withdraw(amount); // get code reuse
		// do something else
	}
}
