package com.xworkz.hireact;

import com.xworkz.hireact.dto.hireactDto;
import com.xworkz.hireact.service.hireactService;
import com.xworkz.hireact.service.hireactServiceImpl;

public class Runner {

	public static void main(String[] args) {

		hireactDto dto = new hireactDto();
		dto.setId(12);
		dto.setName("kishan");
		dto.setQualification("Be");
		dto.setSkills("java");
		dto.setGmail("kishan@gmail.com");

		hireactService service = new hireactServiceImpl();
		// service.save(dto);
//		service.update("HTML", 2);
//		service.deleteByname("kishan");
		service.readByid(1);
		
		

	}
}
