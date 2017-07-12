package javaFundamentals.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class HashtableOfVector {

	public static void main(String[] args) {
		// Store Strings for the key and Vectors of
		// Strings for the values
		Hashtable<String, Vector<String>> ht = new Hashtable<String, Vector<String>>();

		Vector<String> v = new Vector<String>();
		v.add("Denver");
		v.add("Colorado Springs");
		v.add("Fort Collins");
		ht.put("CO", v);

		v = new Vector<String>();
		v.add("Little Rock");
		v.add("Searcy");
		v.add("Hot Springs");
		ht.put("AR", v);

		v = new Vector<String>();
		v.add("Richmond");
		v.add("Norfolk");
		v.add("Virginia Beach");
		ht.put("VA", v);

		// Look up a key in the hashtable
		String key = "CO";
		Vector<String> cities = ht.get(key);
		if (cities == null)
			System.out.println(key + " not found.");
		else
			System.out.println(cities);

		// Print all contents of the hashtable
		Enumeration<String> keys = ht.keys();
		while (keys.hasMoreElements()) {
			key = keys.nextElement();
			cities = ht.get(key);
			System.out.println(key + " : " + cities);
		}
		// Remove AR entry
		ht.remove("AR");

		// Remove all
		ht.clear();

	}

}
