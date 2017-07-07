package javaFundamentals.inheritance.interfaceWithComposition;

public interface Account {
	public abstract double calculateInterest(double amount);

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);
}
