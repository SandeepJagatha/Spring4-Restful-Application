package javaFundamentals.inheritance.interfaceWithComposition;

public class Test {
/*	
	2. Interface inheritance
	
	This is also known as subtyping.
	Interfaces provide a mechanism for specifying a relationship between otherwise unrelated classes, typically by specifying a set of common methods each implementing class must contain.
	Interface inheritance promotes the design concept of program to interfaces not to implementations.
	This also reduces the coupling or implementation dependencies between systems.
	
Q. Which one to use?
Ans: 

	Prefer interface inheritance to implementation inheritance because it promotes the design concept of coding to an interface and reduces coupling. 
	Interface inheritance can achieve code reuse with the help of object composition. 
	If you look at Gang of Four (GoF) design patterns, you can see that it favors interface inheritance to implementation inheritance.
	
Q. Why would you prefer code reuse via composition over inheritance?	
Ans: 
	The advantage of class inheritance is that it is done statically at compile-time and is easy to use. The disadvantage of
	class inheritance is that because it is static, implementation inherited from a parent class cannot be changed at run-time.
	Another problem with class inheritance is that the subclass becomes dependent on the parent class implementation.
	
	In object composition, functionality is acquired dynamically at run-time by objects collecting references to other
	objects. The advantage of this approach is that implementations can be replaced at run-time. This is possible because
	objects are accessed only through their interfaces, so one object can be replaced with another just as long as they
	have the same type.

*/
	
	public static void main(String[] args) {
		Account acc1 = new SavingsAccountImpl();
		acc1.deposit(50.0);
		Account acc2 = new TermDepositAccountImpl();
		acc2.deposit(25.0);
		acc1.withdraw(25);
		acc2.withdraw(10);
		double cal1 = acc1.calculateInterest(100.0);
		double cal2 = acc2.calculateInterest(100.0);
		System.out.println("Savings --> " + cal1);
		System.out.println("TermDeposit --> " + cal2);
	}
}
