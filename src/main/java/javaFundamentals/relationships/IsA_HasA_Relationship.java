package javaFundamentals.relationships;

/*
 * The ‘is a’ relationship is expressed with inheritance and ‘has a’ relationship is expressed with composition. 
 * Both inheritance and composition allow you to place sub-objects inside your new class. 
 * Two of the main techniques for code reuse are class inheritance and object composition.
*/

/*
 * Inheritance is uni-directional. For example House is a Building. 
 * But Building is not a House. Inheritance uses extends key word. Composition: is used when House has a Bathroom. 
 * It is incorrect to say House is a Bathroom. 
 * Composition simply means using instance variables that refer to other objects. 
 * The class House will have an instance variable, which refers to a Bathroom object.
*/


/*
Q. Which one to favor, composition or inheritance?
Ans : The guide is that inheritance should be only used when subclass ‘is a’ superclass.

Don’t use inheritance just to get code reuse. If there is no ‘is a’ relationship then use composition for code
reuse. Overuse of implementation inheritance (uses the “extends” key word) can break all the subclasses, if
the superclass is modified.

Do not use inheritance just to get polymorphism. If there is no ‘is a’ relationship and all you want is
polymorphism then use interface inheritance with composition, which gives you code reuse (Refer Q10
in Java section for interface inheritance).

*/


/*
 Q.What is the difference between aggregation and composition?
 Ans : 
 Aggregation : 
Aggregation is an association in which one class belongs to a collection. 
This is a part of a whole relationship where a part can exist without a whole.

For example : a line item is a whole and product is a part. If a line item is deleted then corresponding product need not be deleted. 
So aggregation has a weaker relationship.

Composition :
Composition is an association in which one class belongs to a collection. 
This is a part of a whole relationship where a part cannot exist without a whole. If a whole is deleted then all parts are
deleted. 

For example : An order is a whole and line items are parts. If an order is deleted then all corresponding line items for that order should be deleted. 
So composition has a stronger relationship.
 
 */


public class IsA_HasA_Relationship {
	public static void main(String[] args) {          
        Maruti myMaruti = new Maruti();  
        myMaruti.setColor("RED");  
        myMaruti.setMaxSpeed(180);  
        myMaruti.carInfo();  
        myMaruti.MarutiStartDemo();  
        myMaruti.MarutiStopDemo(new Engine());
    }
}
