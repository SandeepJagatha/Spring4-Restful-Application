package javaFundamentals.collections.bestPracties;

import java.util.HashSet;
import java.util.Set;

/*
The following code snippet exposes the Set “setCars”
directly to the caller. This approach is riskier because
the variable “cars” can be modified unintentionally.
*/
public class Avoid_EncapsulateCollections {
	private Set<Car> cars = new HashSet<Car>();

	// exposes the cars to the caller
	public Set<Car> getCars() {
		return cars;
	}

	// exposes the cars to the caller
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
}
