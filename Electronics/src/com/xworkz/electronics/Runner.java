package com.xworkz.electronics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Runner {
	
	public static void main(String[] args) {
		
		
		HashMap<String, String> hash = new HashMap<String, String>();
		
		hash.put("Kiran", "28 may");
		hash.put("Kishan", "18 june");
		hash.put("deelip", "12 march");
		hash.put("Tharun", "19 sep");
		
		
//		System.out.println(hash.get("Kiran"));
		
		
		Set<String> keys = hash.keySet();
		for(String result:keys) {
			System.out.println(hash.get(result));
			
		}
	}

}
