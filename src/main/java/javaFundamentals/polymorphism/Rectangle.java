package javaFundamentals.polymorphism;

//The subclass Rectangle needs to implement all the abstract methods in Shape
public class Rectangle implements Shape { // using keyword "implements" instead
											// of "extends"
	// Private member variables
	private int length;
	private int width;

	// Constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}


	// Need to implement all the abstract methods defined in the interface
	@Override
	public double getArea() {
		return length * width;
	}
}
