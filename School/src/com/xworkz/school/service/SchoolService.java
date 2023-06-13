package com.xworkz.school.service;

import com.xworkz.school.dto.SchoolDto;

public interface SchoolService {
	
	public boolean save(Integer id,SchoolDto dto);
	public SchoolDto read();
	public boolean find(Integer id);
	public boolean update(Integer id,String name);
	public boolean delete (Integer id,String location);

	
}
