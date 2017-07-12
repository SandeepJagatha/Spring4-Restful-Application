package javaFundamentals.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * So if you don’t need a thread safe collection, use the ArrayList or HashMap. 
 * Why pay the price of synchronization unnecessarily at the expense of performance degradation.
 */

/*
 * Q. So which is better? 
 * Ans : As a general rule, prefer ArrayList/HashMap to Vector/Hashtable. If your application is a
multithreaded application and at least one of the threads either adds or deletes an entry into the collection
then use new Java collections API‘s external synchronization facility as shown below to temporarily synchronize
your collections as needed:
*/

public class ArrayListAndHashMap {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Integer>> myList = new ArrayList<HashMap<String, Integer>>();

		HashMap<String, Integer> data1 = new HashMap<String, Integer>();
		data1.put("0", new Integer(1));
		data1.put("1", new Integer(2));
		data1.put("2", new Integer(3));
		data1.put("3", new Integer(4));

		HashMap<String, Integer> data2 = new HashMap<String, Integer>();
		data1.put("10", new Integer(10));
		data1.put("11", new Integer(20));
		data1.put("12", new Integer(30));
		data1.put("13", new Integer(40));

		myList.add(data1);
		myList.add(data2);
		
		

		for (int a = 0; a < myList.size(); a++) {
			List myList2 = Collections.synchronizedList (myList); // single lock for the entire list
			
			HashMap<String, Integer> tmpData = (HashMap<String, Integer>) myList2.get(a);
			
			Map myMap = Collections.synchronizedMap (tmpData); // single lock for the entire map
			
			Set<String> key = myMap.keySet();
			Iterator<String> it = key.iterator();
			while (it.hasNext()) {
				String hmKey = (String) it.next();
				Integer hmData = (Integer) tmpData.get(hmKey);

				System.out.println("Key: " + hmKey + " & Data: " + hmData);
				it.remove(); // avoids a ConcurrentModificationException
			}

		}

	}

}
