package javaFundamentals;

public class StaticInitializers {
	/*
    When a class is loaded, all blocks that are declared static and don’t have function name (i.e. static initializers) 
    are executed even before the constructors are executed. 
    As the name suggests they are typically used to initialize static fields.
	*/

	public static final int A = 5;
	public static final int B; // note that it is not -> public static final int  B = null;
	// note that since B is final, it can be initialized only once.
	
	// Static initializer block, which is executed only once when the class is loaded.
	static {
		System.out.println("Inside static block");

		if (A == 5)
			B = 10;
		else
			B = 5;
	}

	public void StaticInitializer(){
		System.out.println("Inside constructor");
	} // constructor is called only after static initializer block
}
