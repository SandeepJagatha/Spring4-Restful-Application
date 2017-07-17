package javaFundamentals.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		Collection<String> myCollection = new ArrayList<String>(10);
		myCollection.add("123");
		myCollection.add("456");
		myCollection.add("789");
		for (Iterator<String> it = myCollection.iterator(); it.hasNext();) {
			String myObject = (String) it.next();
			System.out.println(myObject);
			boolean someConditionIsTrue = true;
			if (someConditionIsTrue) {
				myCollection.remove(myObject); // can throw ConcurrentModificationException in single as
											   // well as multi-thread access situations.
				// fix
				//it.remove(); // removes the current object via the Iterator “it” which has a reference to
				// your underlying collection “myCollection”. Also can use solutions 1-3.
			}
		}

	}

}
