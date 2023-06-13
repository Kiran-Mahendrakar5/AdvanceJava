package com.xworkz.camera.dao;

import java.util.HashMap;

import com.xworkz.camera.dto.CameraDto;

public interface CameraDao {
	public boolean save(Integer key,CameraDto dto);
	
	public HashMap<Integer,CameraDto> read();
	
	public CameraDto findByName(String brand);
	
	public CameraDto updateByPrice(Integer key,int price);
	
	public boolean deleteByName(Integer key,String brand);

}
