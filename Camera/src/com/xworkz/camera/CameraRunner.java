package com.xworkz.camera;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.camera.dto.CameraDto;
import com.xworkz.camera.service.CameraServiceimpl;
import com.xworkz.camera.service.Cameraservice;

public class CameraRunner {

	public static void main(String[] args) {

		CameraDto dto = new CameraDto("nikon", "black", 32000, 4);
		CameraDto dto1 = new CameraDto("sony", "grey", 35000, 5);
		CameraDto dto2 = new CameraDto("canon", "white", 38000, 3);

		Cameraservice service = new CameraServiceimpl();
		System.out.println("..............saved....................");
		service.save(1, dto);
		service.save(2, dto1);
		service.save(3, dto2);

		System.out.println("............finding..................");
		CameraDto find = service.findByName( "nikon");
		System.out.println(find);
		
		System.out.println("...................update.............");
		 service.updateByPrice(2, 35500);
		
		System.out.println("...............deletebrand................");
		service.deleteByName(1, "nikon");

		System.out.println("..............reading.....................");
		HashMap<Integer, CameraDto> result = service.read();
		Set<Integer> key = result.keySet();
		for (Integer keys : key) {
			System.out.println(result.get(keys));
		}

	}
}
