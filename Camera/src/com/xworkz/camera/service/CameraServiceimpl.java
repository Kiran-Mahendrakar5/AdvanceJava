package com.xworkz.camera.service;

import java.util.HashMap;

import com.xworkz.camera.dao.CameraDao;
import com.xworkz.camera.dao.CameradaoImpl;
import com.xworkz.camera.dto.CameraDto;

public class CameraServiceimpl implements Cameraservice {

	CameraDao dao = new CameradaoImpl();

	@Override
	public boolean save(Integer key, CameraDto dto) {
		if (dto != null) {
			if (key != null) {
				if (dto.getBrand() != null) {
					if (dto.getColor() != null) {
						if (dto.getPrice() != 0) {
							if (dto.getRating() != 0) {
								System.out.println("data is validated");
								return dao.save(key, dto);

							}
							System.out.println("rating is zero ");
						}
						System.out.println("price is zero");
						return false;
					}
					System.out.println("color is null");
					return false;
				}
				System.out.println("brand is null");
				return false;
			}
			System.out.println("keys is zero");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public HashMap<Integer, CameraDto> read() {

		return dao.read();
	}

	@Override
	public CameraDto findByName( String brand) {
			if (brand != null) {
				System.out.println("finded");
				return dao.findByName(brand);

			}
			System.out.println("brand is null");
			return null;
		
	}

	@Override
	public boolean updateByPrice(Integer key, int price) {
		if (key != null) {
			if (price != 0) {
				System.out.println("updated");
				dao.updateByPrice(key, price);
				return true;

			}
			System.out.println("price is zero");
			return false;
		}
		System.out.println("keys is zero");
		return false;
	}

	@Override
	public boolean deleteByName(Integer key, String brand) {
		if (key != 0) {
			if (brand != null) {
				System.out.println("deleted");
				dao.deleteByName(key, brand);
				return true;
			}
		}
		return false;
	}

}
