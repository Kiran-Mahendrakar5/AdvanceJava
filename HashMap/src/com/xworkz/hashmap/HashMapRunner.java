package com.xworkz.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapRunner {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hsh = new HashMap<Integer,String>();
		
		hsh.put(1, "Elephants");
		hsh.put(2, "lion");
		hsh.put(3, "cow");
		hsh.put(4, "horse");
		hsh.put(5, "tiger");
		
		Set<Integer> key = hsh.keySet();
		System.out.println(key);
		
		
		for(Integer ref:key) {
			System.out.println(hsh.get(ref));
		}
		
		
		
		
		
		
	}

}
