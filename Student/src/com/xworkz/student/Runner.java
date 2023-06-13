package com.xworkz.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.xworkz.student.dto.StudentDto;

public class Runner {
	
	public static void main(String[] args) {
		
		ArrayList<StudentDto> ary = new ArrayList<StudentDto>();
		
		
	StudentDto dto = new StudentDto("Kiran", 2456, 23, "Bsc", "Bangalore");
	StudentDto dto1 = new StudentDto("ulaga", 2457, 27, "Be", "Tamilnadu");
	StudentDto dto2 = new StudentDto("Shuheb", 2458, 25, "Bba", "Hassan");
	ary.add(dto);
	ary.add(dto1);
	ary.add(dto2);
	
	
//	for(StudentDto frr:ary) {
//		System.out.println(frr);
//	}
	
	
	Comparator<StudentDto> cmp = new Comparator<StudentDto>() {

		@Override
		public int compare(StudentDto o1, StudentDto o2) {
			if(o1.getAge()>o2.getAge()) {
				return 1;
			}
			return -1;
		}		
	};
	Collections.sort(ary,cmp);
	for (StudentDto studentDto : ary) {
		System.out.println(studentDto);
	}
	
	

	}
}
