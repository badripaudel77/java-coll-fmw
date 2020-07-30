package com.ncit.coll.map;

import java.util.Map;

public class MapTest {

	public static void main(String[] args) throws InterruptedException {

		HashMapExample hMap = new HashMapExample();

		Map<String, String> countries = hMap.countries();
		System.out.println(countries);

		// get the value using key
		System.out.println("In which continent does Nepal lie ? : " + countries.get("Nepal"));

		// get all the keys, and their corresponding values
		System.out.println("'countries - continent'");
		for (String countryKey : countries.keySet()) {
			System.out.println(countryKey + " - " + countries.get(countryKey));
		}

		// check if "value" (not key) exists.
		boolean doesContain = countries.containsValue("Asia");
		System.out.println("Does countries map has Asia ? : " + doesContain);
	}
}
