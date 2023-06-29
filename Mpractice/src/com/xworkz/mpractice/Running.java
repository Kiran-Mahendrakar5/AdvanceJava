package com.xworkz.mpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Running {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lst = new ArrayList();
		
		lst.add(64);
		lst.add(4);
		lst.add(32);
		lst.add(2);
		lst.add(45);
		lst.add(1);

		
		
		Comparator<Integer> cmr = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					return 1;
				}else {
					return -1;
				}
				
			}
			
		};
		Collections.sort(lst,cmr);
		for(Integer ref:lst) {
			System.out.println(ref);
			
		}
		
	}

}
