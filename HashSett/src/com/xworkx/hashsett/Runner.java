package com.xworkx.hashsett;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Runner {

	public static void main(String[] args) {
		
		
		HashSet<String> hash = new HashSet<String>();
		LinkedHashSet<String> hash1 = new LinkedHashSet<String>();
		
		hash.add("kiran");
		hash.add("kishan");
		hash.add("Siddhu");
		hash.add("Siddhu");
		
		for(String ref:hash) {
			System.out.println(ref);
		}
		
		hash1.add("deepu");
		hash1.add("Aishu");
		hash1.add("Srinivas");
		hash1.add("Srinivas");
		
		
		for(String refe:hash1) {
			System.out.println(refe);
			
		}
		
		

	}

}
