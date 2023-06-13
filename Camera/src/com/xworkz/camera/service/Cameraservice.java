package com.xworkz.camera.service;

import java.util.HashMap;

import com.xworkz.camera.dto.CameraDto;

public interface Cameraservice {
	
	public boolean save(Integer key,CameraDto dto);
	
	public HashMap<Integer,CameraDto> read();
	
	public CameraDto findByName(String brand);
	
	public boolean updateByPrice(Integer key,int price);
	
	public boolean deleteByName(Integer key,String brand);
	

}
