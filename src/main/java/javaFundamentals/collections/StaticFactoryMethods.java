package javaFundamentals.collections;

import java.util.Arrays;

public class StaticFactoryMethods {

	public static void main(String[] args) {
		String[] myArray = { "Java", "J2EE", "XML", "JNDI" };
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		System.out.println(Arrays.asList(myArray)); // factory method Arrays.asList(…)

	}

}
