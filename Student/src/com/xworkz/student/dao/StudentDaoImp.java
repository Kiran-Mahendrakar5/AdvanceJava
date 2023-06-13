package com.xworkz.student.dao;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public class StudentDaoImp implements StudentDao {
	
	HashMap<Integer,StudentDto> map = new HashMap<Integer,StudentDto>();

	@Override
	public boolean save(Integer id, StudentDto dto) {
		map.put(id, dto);
		System.out.println("saves succefully");
		return true;
	}

	@Override
	public HashMap<Integer,StudentDto> read() {
		return (map);
	}

	@Override
	public boolean find(Integer id) {
		map.get(id);
		System.out.println();
		return true;
	}
	

}
