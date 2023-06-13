package com.xworkz.camera.dao;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.camera.dto.CameraDto;

public class CameradaoImpl implements CameraDao {

	HashMap<Integer, CameraDto> map = new HashMap<Integer, CameraDto>();

	@Override
	public boolean save(Integer key, CameraDto dto) {
		map.put(key, dto);
		System.out.println("data is saved");

		return true;
	}

	@Override
	public HashMap<Integer, CameraDto> read() {
		return map;
	}

	@Override
	public CameraDto findByName(String brand) {
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			CameraDto dto = map.get(key);
			if (dto.getBrand().equals(brand)) {
				return dto;

			}
		}

		System.out.println("data is finded");
		return null;
	}

	@Override
	public CameraDto updateByPrice(Integer key, int price) {
		CameraDto update = map.get(key);
		update.setPrice(price);
		return update;
	}

	@Override
	public boolean deleteByName(Integer key, String brand) {
		map.remove(key);
		System.out.println("data is deleted");
		return true;
	}

}
