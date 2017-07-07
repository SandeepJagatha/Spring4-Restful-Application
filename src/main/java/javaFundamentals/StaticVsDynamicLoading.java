package javaFundamentals;

import hello.Greeting;

public class StaticVsDynamicLoading {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// Static loading
		// Classes are statically loaded with Java’s “new” operator.
		/*
		 * A NoClassDefFoundException is thrown if a class is referenced with
		 * Java’s “new” operator (i.e. static loading) but the runtime system
		 * cannot find the referenced class.
		 */
		Greeting c = new Greeting(0, null);
		System.out.println(c);

		// Dynamic loading
		//Dynamic loading is a technique for programmatically invoking the functions of a class loader at run time. Let us look at how to load classes dynamically.
		/*
		 * A ClassNotFoundException is thrown when an application tries to load
		 * in a class through its string name using the following methods but no
		 * definition for the class with the specified name could be found: 
		 * 􀂃 The forName(..) method in class - Class. 
		 * 􀂃 The findSystemClass(..) method in class - ClassLoader. 
		 * 􀂃 The loadClass(..) method in class - ClassLoader.
		 */
		javaFundamentals.Greeting greeting = null;
		String myClassName = "javaFundamentals.Greeting";
		Class greetingClass = Class.forName(myClassName);
		System.out.println(greetingClass);
		greeting = (javaFundamentals.Greeting) greetingClass.newInstance();
		System.out.println(greeting);
	}

}
