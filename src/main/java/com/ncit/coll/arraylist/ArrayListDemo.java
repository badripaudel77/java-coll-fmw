package com.ncit.coll.arraylist;

import java.util.Iterator;
import java.util.List;
/*
 * Vector is also similar to ArrayList except its Synchronized and its 
 * doubles its size if needed to expand unlike expanding by half in ArrayList
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayListExample al = new ArrayListExample();
		
		List<String> persons = al.givePersons();
		
		//iterating using forEach loop
		System.out.print("All Persons : ");
		for(String person :  persons) {
			System.out.print( person + " ");
		}
		persons.remove(0);

		System.out.println("\nAfter removing [0] one person " + persons);
		
		String lastPerson = persons.get(persons.size() -1);
		System.out.println("last Person is " + lastPerson);
		
		//set the first person to the John
		persons.set(0, "John");
		
	   //iterating using Iterator
		Iterator<String> iterator = persons.iterator();
		
		System.out.print("after iterating using iterator : ");
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
