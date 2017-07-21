package javaFundamentals.collections.bestPracties;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 This approach prevents the caller from directly using
the underlying variable “cars”.
 */
public class BetterApproach_EncapsulateCollections {
	private Set<Car> cars = new HashSet<Car>();

	// ...
	public void addCar(Car car) {
		cars.add(car);
	}

	public void removeCar(Car car) {
		cars.remove(car);
	}

	public Set<Car> getCars() {
		// use factory method from the Collections
		// Returns an unmodifiable view of the specified set. This method allows modules
		// to provide users with "read-only" access to internal sets. Query operations
		// on the returned set "read through" to the specified set, and attempts to
		// modify the returned set, whether direct or via its iterator, result in an
		// UnsupportedOperationException.
		return Collections.unmodifiableSet(cars);
	}
}
