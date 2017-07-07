package javaFundamentals.inheritance.implementation;

public abstract class Account {
	public void deposit(double amount) {
		System.out.println("depositing " + amount);
	}

	public void withdraw(double amount) {
		System.out.println("withdrawing " + amount);
	}

	public abstract double calculateInterest(double amount);
}
