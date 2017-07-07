package javaFundamentals.inheritance.implementation;

public class Test {
	
/*	Inheritance – is the inclusion of behavior (i.e. methods) and state (i.e. variables) of a base class in a derived class so
	that they are accessible in that derived class. The key benefit of Inheritance is that it provides the formal mechanism for
	code reuse. Any shared piece of business logic can be moved from the derived class into the base class as part of
	refactoring process to improve maintainability of your code by avoiding code duplication. The existing class is called the
	superclass and the derived class is called the subclass. Inheritance can also be defined as the process whereby one
	object acquires characteristics from one or more other objects the same way children acquire characteristics from their
	parents.*/
	
//	There are two types of inheritances
/*	
	1. Implementation inheritance
	
	With implementation inheritance, the subclass becomes tightly coupled with the superclass.
	This will make the design fragile because if you want to change the superclass, you must know all the details of the subclasses to avoid breaking them.
	So when using implementation inheritance, make sure that the subclasses depend only on the behavior of the superclass, not on the actual implementation.
	
*/
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
