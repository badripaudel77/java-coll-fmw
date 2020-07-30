package com.ncit.coll.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedListExample linkedList = new LinkedListExample();
		
		LinkedList<String> persons = linkedList.givePersons();
		System.out.print("first time Persons are : " );
		
		for(String person : persons) {
			System.out.print(person + " ");
		}
		
		//remove one element, always going remove first element of the list 
		persons.remove(); 
		System.out.print("\nafter removing one element : " );
		
	     //Iterating LinkedList
	     Iterator<String> iterator=persons.iterator();
	      
	      while(iterator.hasNext()){
	       System.out.print(iterator.next() + " ");
	   }  
	   System.out.println();   
	   
	   //adding one element in the list
	   persons.add("Smith");
	   System.out.println("after adding Smith to the list : " + persons);
	   
	   //printing the last elements of the list
	   System.out.println("The last element of the list : " + persons.get(persons.size() -1));
	   
	   boolean isPresent = persons.contains("Smith");
	   System.out.println("does person contains Smith in its list ? " + isPresent);
	   
   } 
}
