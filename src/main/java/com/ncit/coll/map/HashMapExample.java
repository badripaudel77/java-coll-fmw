package com.ncit.coll.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public Map<String, String> countries() {
		
		Map<String, String> countries = new HashMap<String, String>();
		
		countries.put("Nepal",  "Asia");
		countries.put("USA",  "North America");
		countries.put("UK",  "Europe");
		countries.put("Nigeria",  "Africa");
		countries.put("Brazil",  "South America");
		
		return countries;
	}

}
