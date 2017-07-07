package javaFundamentals.polymorphism;

/*
The benefit of polymorphism is that it is very easy to add new
classes of derived objects without breaking the calling code that uses the polymorphic classes or interfaces.

When you send a message to an object even though you
don’t know what specific type it is, and the right thing happens, that’s called polymorphism. 

The process used by object-oriented programming languages to implement polymorphism is called dynamic binding.
*/
public class PolymorphismTest {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(1, 2); // upcast
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());

		Shape s2 = new Triangle(3, 4); // upcast
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea());

		// Cannot create instance of an interface
		// Shape s3 = new Shape("green"); // Compilation Error!!
	}

}
