package com.xworkz.comparator;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.xworkz.comparator.dto.CollegeDto;

public class ComparatorRunner {
	
	public static void main(String[] args) {
		
//		ArrayList<Integer> lst = new ArrayList();
//		
//		lst.add(64);
//		lst.add(4);
//		lst.add(32);
//		lst.add(2);
//		lst.add(45);
//		lst.add(1);
//	
//		Comparator<Integer> cmr = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(o1%10>o2%10) {
//					return 1;
//				}else {
//					return -1;
//				}
//			}
//		
//		};
//		Collections.sort(lst,cmr);
//		for(Integer fr:lst) {
//			System.out.println(fr);
//		}
//		
		
		ArrayList<CollegeDto> lstt = new ArrayList();
		
		CollegeDto dto = new CollegeDto("Siddartha", "SSIT", 50000);
		CollegeDto dto1 = new CollegeDto("Chetana", "Thindlu", 60000);
		CollegeDto dto2 = new CollegeDto("presidency", "yalanka", 40000);
		lstt.add(dto2);
		lstt.add(dto1);
		lstt.add(dto);
		
		for(CollegeDto frr:lstt) {
			System.out.println(frr);
		}
		
		
			
	
		Comparator<CollegeDto> cmd = new Comparator<CollegeDto>() {

			@Override
			public int compare(CollegeDto o1, CollegeDto o2) {
			if(o1.getName().length()>o2.getName().length()) {
				return 1;
			}
				
			return -1;
			
			}
			
		};
		
//		Collections.sort(lstt);//printing comparable
//		System.out.println(lstt);
		
		Collections.sort(lstt,cmd);
		System.out.println(lstt);//printing comparator
		
	}
		

		
		}

