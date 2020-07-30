package com.ncit.coll.treemap;

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMapExample continentMap  = new TreeMapExample();
		
		//create 
		continentMap.create();
		
		//insert data
		continentMap.insert();
		
		//display
		continentMap.display();

		//search Asia by key
		continentMap.search("Asia");

		//search by value
		continentMap.search(45);
		
		//traverse
		continentMap.traverse();
	}

}
