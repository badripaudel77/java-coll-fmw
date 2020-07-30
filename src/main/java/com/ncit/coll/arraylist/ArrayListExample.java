package com.ncit.coll.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ArrayList in Java is used to store dynamically sized collection of elements. 
 * Contrary to Arrays that are fixed in size, an ArrayList grows 
 * its size automatically when new elements are added to it.
 *ArrayList is part of Java’s collection framework and implements Java’s List interface.
*/

public class ArrayListExample extends Object {
	
	List<String> persons = new ArrayList<>();
	
	public ArrayListExample() {}
    
    public List<String> givePersons() {
    	persons.add("Ram");
    	persons.add("Hari");
    	persons.add("Gita");
    	persons.add("Jerry");
    	persons.add("Kyle");
    	
    	return persons;
    }
}
 
