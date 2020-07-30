package com.ncit.coll.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 
 */
public class QueueExample {

	public Queue<String> getPersons() {
		
		Queue<String> persons = new PriorityQueue<String>();
		
		persons.add("Badri");
		persons.add("Ganesh");
		persons.add("Sushil");
		
		return persons;
	}
	
	public void calculate() {
		
		Queue<String> persons = getPersons();
//		
//		System.out.print(" ");
//	     for(String person : persons) {
//	    	 
//	    	 System.out.print(person + " ");
//	     }
	     
	     Iterator<String> iterator = persons.iterator(); 
	     
	        while (iterator.hasNext()) { 
	            
	        	System.out.print(iterator.next() + " "); 
	        }
	        
	       //common methods .......
	       //............ 
	}
	
}
