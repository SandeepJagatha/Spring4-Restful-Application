package javaFundamentals.constructors;

public class ConstructorsVsRegularMethods extends ConstructorsVsRegularMethods1{
	
	public static int id= 0;
	public String type = "";

	/*
	 * Constructors must have the same name as the class name and cannot return a value. 
	 * The constructors are called only once per creation of an object while regular methods can be called many times.
	*/
	public ConstructorsVsRegularMethods() { //Constructor 
		super(id);
	}
	
	/*
	 * Regular methods can have any name and can be called any number of times.
	*/
	public void createConstructorsVsRegularMethods() { //regular method has a void return type
		// TODO Auto-generated constructor stub
	}
	
	
	// Q. Can you call one constructor from another? 
	// Yes, by using this() syntax.
	public ConstructorsVsRegularMethods(int id) {
		super(id);
		this.id = id; // “this” means this object
	}

	public ConstructorsVsRegularMethods (int id, String type) {
		this(id); // calls constructor public Pet(int id)
		this.type = type; // ”this” means this object
	}
	
	
	// Q. How to call the superclass constructor? 
	// If a class called “SpecialPet” extends your “Pet” class then you can use the keyword “super” to invoke the superclass’s constructor.
	
	//To call a regular method in the super class use: “super.myMethod( );”. This can be called at any line.
	public ConstructorsVsRegularMethods(int id, float f) {
		super(id); //must be the very first statement in the constructor.
	}
}
