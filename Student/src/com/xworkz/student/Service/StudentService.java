package com.xworkz.student.Service;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public interface StudentService {
	
	public boolean save(Integer id,StudentDto dto);
	public HashMap<Integer,StudentDto> read();
	public boolean find(Integer id);
	
	
	

}
