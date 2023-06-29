 package com.xworkz.eventorganization.repository;

import com.xworkz.eventorganization.dto.EventorganizationDto;

public interface EventorganizationRepository {
	
	public boolean validateAndSave(EventorganizationDto dto);
	public boolean update(String events, int id);
	public boolean update1(String founder,int id);
	public boolean update2(String gmail);
	public boolean update3(String founder,String CEO,String location,String gmail,String ModeOfPayment ,int id);
	


}
