package javaFundamentals.collections;

import java.util.Enumeration;
import java.util.Hashtable;


/*
 * Vectors are ideal for storing lists of items where you typically do not need to search through the list for a specific item. 
 * Hashtables are ideal for storing key-value pairs. 
 * Access to any key-value is very fast when searching by key unlike Vectors which require a search through the entire Vector. 
 */
public class HashtableDemo {

	public static void main(String[] args) {
		// Store Strings for the key & Strings for the values
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("123", "Bob");
		ht.put("456", "Jane");
		ht.put("789", "Lulu");

		// Look up a key in the hashtable
		String key = "123";
		String name = ht.get(key);
		if (name == null)
			System.out.println(key + " not found.");
		else
			System.out.println(name);

		// Print all contents of the hashtable
		Enumeration<String> keys = ht.keys();
		while (keys.hasMoreElements()) {
			key = keys.nextElement();
			name = ht.get(key);
			System.out.println(key + " : " + name);
		}

		// Remove Jane
		ht.remove("456");

		// Remove everyone
		ht.clear();

	}

}
