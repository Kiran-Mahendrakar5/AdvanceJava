package com.xworkz.student;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.student.Service.StudentService;
import com.xworkz.student.Service.StudentServiceImp;
import com.xworkz.student.dao.StudentDaoImp;
import com.xworkz.student.dto.StudentDto;

public class StudentRunner {
	
	public static void main(String[] args) {
		
		
		StudentDto dto = new StudentDto("Kiran", 2456, 23, "Bsc", "Bangalore");
		StudentDto dto1 = new StudentDto("ulaga", 2457, 24, "Be", "Tamilnadu");
		StudentDto dto2 = new StudentDto("Shuheb", 2458, 25, "Bba", "Hassan");
		
		//StudentDaoImp dao = new StudentDaoImp();
		StudentService service = new StudentServiceImp();
		service.save(1, dto);
		service.save(2, dto1);
		service.save(3, dto2);
		
		HashMap<Integer,StudentDto> reed= service.read();
		Set<Integer> stt = reed.keySet();
		for(Integer ref:stt) {
			System.out.println(ref);
			
			
		}
		boolean result= service.find(1) ;
		System.out.println(result);
		
	}

}
