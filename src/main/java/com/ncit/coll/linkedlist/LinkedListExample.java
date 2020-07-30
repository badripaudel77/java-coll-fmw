package com.ncit.coll.linkedlist;

import java.util.LinkedList;

/*
 * 1) LinkedList has Head(contains address of first node, 
 * 2) The Last element of the LinkedList contains null in the pointer part of the node because... 
 *    it is the end of the List so it doesn’t point to anything 
 * 3) 
 */
public class LinkedListExample {
 
	public LinkedList<String> givePersons() {
		
		LinkedList<String> persons = new LinkedList<>();
		
		persons.add("John");
		persons.add("Villa");
		persons.add(0, "Badri");
		persons.add("Jiwan");
		
		return persons;
		
	}

}
