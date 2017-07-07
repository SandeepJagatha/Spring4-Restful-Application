package javaFundamentals.inheritance.implementation;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new SavingsAccount();
		acc1.deposit(50.0);
		Account acc2 = new TermDepositAccount();
		acc2.deposit(25.0);
		acc1.withdraw(25);
		acc2.withdraw(10);
		double cal1 = acc1.calculateInterest(100.0);
		double cal2 = acc2.calculateInterest(100.0);
		System.out.println("Savings --> " + cal1);
		System.out.println("TermDeposit --> " + cal2);
	}
}
