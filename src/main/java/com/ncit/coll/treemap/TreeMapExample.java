package com.ncit.coll.treemap;

import java.util.Map;
import java.util.TreeMap;

/*
 * TreeMap is just an implementation of Map interface.
 * 
 */
public class TreeMapExample {     
	
	// Declaring a TreeMap 
    static TreeMap<String,Integer> continentAndNoOfcountries; 
  
    // Function to create TreeMap 
     void create() 
    { 
        // Creating an empty TreeMap 
    	continentAndNoOfcountries 
            = new TreeMap<String, Integer>(); 
  
        System.out.println( 
            "Empty TreeMap successfully"
            + " created"); 
    } 
  
    // Function to Insert values in 
    // the TreeMap 
     void insert() 
    { 
        // Mapping string values to int keys 
    	continentAndNoOfcountries.put("Asia",48); //largest
    	continentAndNoOfcountries.put("Africa",54); //second largest
    	continentAndNoOfcountries.put("Europe",45); 
    	continentAndNoOfcountries.put("North America", 23);
    	continentAndNoOfcountries.put("South America", 12);
    	continentAndNoOfcountries.put("Antartica",0);
    	continentAndNoOfcountries.put("Oceania/Australia", 14); //smallest.. 

  
    	System.out.println("data inserted successfully. " + continentAndNoOfcountries);
    	
    } 
  
    // Function to search a key in TreeMap 
     void search(String continentKey) 
    { 
  
        // Checking for the key 
        System.out.println( 
            "\nIs key \""
            + continentKey + "\" present? "
            + continentAndNoOfcountries.containsKey(continentKey)); 
    } 
  
    // Function to search a value in TreeMap 
     void search(int noOfConuntry) 
    { 
  
        // Checking for the value 
        System.out.println( 
            "\nIs value \""
            + noOfConuntry + "\" present? "
            + continentAndNoOfcountries.containsValue(noOfConuntry)); 
    } 
  
    // Function to display the elements in TreeMap 
     void display() 
    { 
        System.out.println( 
            "TreeMap: " + continentAndNoOfcountries ); 
    } 
  
    // Function to traverse TreeMap 
     void traverse() 
    { 
        System.out.println("\nTraversing the TreeMap:"); 
        for (Map.Entry <String, Integer> e : continentAndNoOfcountries.entrySet()) 
            System.out.println(e.getKey()     + " " + e.getValue()); 
                           
    }     
}
