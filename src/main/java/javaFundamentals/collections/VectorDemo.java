package javaFundamentals.collections;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Original classes before the introduction of Collections API. 
 * Vector & Hashtable are synchronized. 
 * Any method that touches their contents is thread-safe.
 */
public class VectorDemo {
	public static void main(String[] args) {        
		// Store Strings in a vector
		Vector<String> v = new Vector<String>(); 
		v.add("Football");
		v.add("Basketball");
		v.add("Tennis");

		// Get first and second elements in the vector
		String firstSport = v.firstElement();
		String secondSport = v.get(1);

		// Print all contents of the vector
		Enumeration<String> sports = v.elements();
		while (sports.hasMoreElements()) {
			String sport = sports.nextElement();
			System.out.println(sport);
		}

		// Remove Tennis
		v.remove(2);

		// Remove all
		v.removeAllElements();
	}
}
