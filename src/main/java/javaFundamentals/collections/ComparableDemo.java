package javaFundamentals.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo implements Comparable {

	int petId;
	String petType;

	public ComparableDemo(int argPetId, String argPetType) {
		petId = argPetId;
		this.petType = argPetType;
	}

	@Override
	public int compareTo(Object o) {
		ComparableDemo petAnother = (ComparableDemo) o;
		// natural alphabetical ordering by type
		// if equal returns 0, if greater returns +ve int,
		// if less returns -ve int
		return this.petType.compareTo(petAnother.petType);
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new ComparableDemo(2, "Dog"));
		list.add(new ComparableDemo(1, "Parrot"));
		list.add(new ComparableDemo(2, "Cat"));
		Collections.sort(list); // sorts using compareTo method
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			ComparableDemo element = (ComparableDemo) iter.next();
			System.out.println(element);
		}
	}

	public String toString() {
		return petType;
	}
}
