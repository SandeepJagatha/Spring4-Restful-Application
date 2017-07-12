package javaFundamentals.encapsulation;

public class MyMarks {
/*	
	refers to keeping all the related members (variables and methods) together in an object. 
	Specifying member variables as private can hide the variables and methods.
	Objects should hide their inner workings from the outside view.
	
	Good encapsulation improves code modularity by preventing objects interacting with each other in
	an unexpected way, which in turn makes future development and refactoring efforts easy.
	
	Being able to encapsulate members of a class is important for security and integrity. We can protect variables from
	unacceptable values.
*/
	
	
	/*sample code above describes how encapsulation can be used to protect the MyMarks object
	from having negative values. Any modification to member variable “vmarks” can only be carried out through the setter
	method setMarks(int mark). This prevents the object “MyMarks” from having any negative values by throwing an
	exception.*/
	private int vmarks = 0;
	private String name;

	public void setMarks(int mark) throws MarkException {
		if (mark > 0)
			this.vmarks = mark;
		else {
			throw new MarkException("No negative Values");
		}
	}

	public int getMarks() {
		return vmarks;
	}
	// getters and setters for attribute name goes here.
}
