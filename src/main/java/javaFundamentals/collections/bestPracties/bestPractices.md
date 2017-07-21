### 17: What are some of the best practices relating to Java collection? BP PI CI
Ans :
* Use ArrayList, HashMap etc as opposed to Vector, Hashtable etc, where possible to avoid any
  synchronization overhead. Even better is to use just arrays where possible. If multiple threads concurrently
  access a collection and at least one of the threads either adds or deletes an entry into the collection,
  then the collection must be externally synchronized. This is achieved by:
    ```java
	Map myMap = Collections.synchronizedMap (myMap); //conditional thread-safety
	List myList = Collections.synchronizedList (myList); //conditional thread-safety
	// use java.util.concurrent package for J2SE 5.0 Refer Q16 in Java section under ConcurrentModificationException
	```
* Set the initial capacity of a collection appropriately (e.g. ArrayList, HashMap etc). This is because Collection
	classes like ArrayList, HashMap etc must grow periodically to accommodate new elements. But if you have a
	very large array, and you know the size in advance then you can speed things up by setting the initial size
	appropriately.
	For example: HashMaps/Hashtables need to be created with sufficiently large capacity to minimize
	rehashing (which happens every time the table grows). HashMap has two parameters initial capacity and
	load factor that affect its performance and space requirements. Higher load factor values (default load factor
	of 0.75 provides a good trade off between performance and space) will reduce the space cost but will
	increase the lookup cost of myMap.get(…) and myMap.put(…) methods. When the number of entries in the
	HashMap exceeds the current capacity * loadfactor then the capacity of the HasMap is roughly doubled by
	calling the rehash function. It is also very important not to set the initial capacity too high or load factor too
	low if iteration performance or reduction in space is important.
* Program in terms of interface not implementation: CO For example you might decide a LinkedList is the
	best choice for some application, but then later decide ArrayList might be a better choice for performance
	reason. CO
	```java
	Use:
	List list = new ArrayList(100); // program in terms of interface & set the initial capacity.
	Instead of:
	ArrayList list = new ArrayList();
	```
* Return zero length collections or arrays as opposed to returning null: CO Returning null instead of zero
	length collection (use Collections.EMPTY_SET, Collections.EMPTY_LIST, Collections.EMPTY_MAP) is more
	error prone, since the programmer writing the calling method might forget to handle a return value of null.
* Immutable objects should be used as keys for the HashMap: CO Generally you use a java.lang.Integer or
	a java.lang.String class as the key, which are immutable Java objects. If you define your own key class then it
	is a best practice to make the key class an immutable object (i.e. do not provide any setXXX() methods
	etc). If a programmer wants to insert a new key then he/she will always have to instantiate a new object (i.e.
	cannot mutate the existing key because immutable key object class has no setter methods). Refer Q20 in
	Java section under “Q. Why is it a best practice to implement the user defined key class as an
	immutable object?”
* Encapsulate collections: CO In general collections are not immutable objects. So care should be taken not
	to unintentionally expose the collection fields to the caller.
* Avoid storing unrelated or different types of objects into same collection: CO This is analogous to
	storing items in pigeonholes without any labeling. To store items use value objects or data objects (as
	opposed to storing every attribute in an ArrayList or HashMap). Provide wrapper classes around your
	collections API classes like ArrayList, HashMap etc as shown in better approach column. Also where
	applicable consider using composite design pattern, where an object may represent a single object or a
	collection of objects. Refer Q61 in Java section for UML diagram of a composite design pattern. If you are
	using J2SE 5.0 then make use of “generics”. Refer Q55 in Java section for generics.
