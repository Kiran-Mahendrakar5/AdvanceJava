package com.xworkz.student.Service;

import java.util.HashMap;

import com.xworkz.student.dao.StudentDao;
import com.xworkz.student.dao.StudentDaoImp;
import com.xworkz.student.dto.StudentDto;

public class StudentServiceImp implements StudentService {
	StudentDao dao = (StudentDao) new StudentDaoImp();

	@Override
	public boolean save(Integer id, StudentDto dto) {
		if (dto != null) {
			if (dto.getName() != null) {
				if (dto.getAge() != 0) {
					if (dto.getPlace() != null) {
						if (dto.getRegisterNumber() != 0) {
							System.out.println("date is saves");
							dao.save(id, dto);
							return true;

						}
					}
					System.out.println("get place is null");
					return false;

				}
				System.out.println("get age is zero");
				return false;

			}
			System.out.println("get name is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public HashMap<Integer,StudentDto> read() {
		
		return dao.read();
	}

	@Override
	public boolean find(Integer id ) {
		if(id!=0) {
			System.out.println("Finded key");
			dao.find(id);
			return true;
			
		}
		System.out.println("id is 0");
		return false;
	}

}
