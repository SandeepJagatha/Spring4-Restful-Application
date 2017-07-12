package javaFundamentals.overloadingOverriding;


/*
 * Overloading deals with multiple methods in the same class with the same name but different method signatures.
 * Both the above methods have the same method names but different method signatures, which mean the methods are overloaded.
 * Overloading lets you define the same operation in different ways for different data.
*/
public class Overloading {
	public void getInvestAmount(int rate) {
	}

	public void getInvestAmount(int rate, long principal) {
	}
}
