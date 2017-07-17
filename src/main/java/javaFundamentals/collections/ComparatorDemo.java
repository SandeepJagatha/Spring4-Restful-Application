package javaFundamentals.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorDemo implements Comparator {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Pet(2, "Dog"));
		list.add(new Pet(1, "Parrot"));
		list.add(new Pet(2, "Cat"));
		Collections.sort(list, new ComparatorDemo());
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Pet element = (Pet) iter.next();
			System.out.println(element.getPetType());
		}
	}

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		Pet pet = (Pet) o1;
		Pet petAnother = (Pet) o2;
		// use Integer class's natural ordering
		Integer pId = new Integer(pet.getPetId());
		Integer pAnotherId = new Integer(petAnother.getPetId());
		result = pId.compareTo(pAnotherId);
		// if ids are same compare by petType
		if (result == 0) {
			result = pet.getPetType().compareTo(petAnother.getPetType());
		}
		return result;
	}
}
