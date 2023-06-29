package com.xworkz.mpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.xworkz.mpractice.dto.mobileDto;


public class Starterr {
	public static void main(String[] args) {
		
		ArrayList<mobileDto> ary = new ArrayList<mobileDto>();
		
		mobileDto dto = new mobileDto("apple", 25000);
		mobileDto dto1 = new mobileDto("sumsung", 15000);
		mobileDto dto2 = new mobileDto("one plus", 20000);
		mobileDto dto3 = new mobileDto("vivo", 13000);
		ary.add(dto);
		ary.add(dto1);
		ary.add(dto2);
		ary.add(dto3);
		
		
		Comparator<mobileDto> cmr = new Comparator<mobileDto>() {

			@Override
			public int compare(mobileDto o1, mobileDto o2) {
			if(o1.getBrand().length()>o2.getBrand().length()) {
				return 1;
			}else {
				return -1;
			}
				
			}
			
		};
		Collections.sort(ary);
		for(mobileDto frr:ary) {
			System.out.println(frr);
			
		}
		
	}

}
