package com.xworkz.hashmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.hashmap.dto.ElectronicDto;
import com.xworkz.hashmap.util.DateComparator;
import com.xworkz.hashmap.util.NameComparator;
import com.xworkz.hashmap.util.PriceComparator;
import com.xworkz.hashmap.util.warrantyComparator;

public class ElectronicRunner {

	public static void main(String[] args) {
		
		ElectronicDto dto = new ElectronicDto("HavellsFan", 1500, 12, 365);
		ElectronicDto dto1 = new ElectronicDto("nikonCamera", 35000, 14, 180);
		ElectronicDto dto2 = new ElectronicDto("jblSpeaker", 7500, 17, 30);
		ElectronicDto dto3 = new ElectronicDto("DellLaptop", 40000, 19, 300);
		ElectronicDto dto4 = new ElectronicDto("onePlus", 25000, 24, 350);
		ElectronicDto dto5 = new ElectronicDto("Iwatch", 35500, 21, 360);
		ElectronicDto dto6 = new ElectronicDto("Airpods", 24500, 23, 60);
		ElectronicDto dto7 = new ElectronicDto("boatHeadSet", 2300, 26, 7);
		ElectronicDto dto8 = new ElectronicDto("SonyTv", 45000, 10, 912);
		ElectronicDto dto9 = new ElectronicDto("DroneCamera", 55000, 29, 31);
		
		
		List<ElectronicDto> list = Arrays.asList(dto,dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9);
		
		//PriceComparator price = new PriceComparator();
		//DateComparator date = new DateComparator();
		//warrantyComparator warranty = new warrantyComparator();
		NameComparator name = new NameComparator();
		
		
//		Collections.sort(list,price);
//		for(ElectronicDto result : list) {
//			System.out.println(result);
//		}
		
//		Collections.sort(list,date);
//		for(ElectronicDto result : list) {
//			System.out.println(result);
//		}
		
//		Collections.sort(list,warranty);
//		for(ElectronicDto result : list) {
//			System.out.println(result);
//		}
		
		Collections.sort(list,name);
		for(ElectronicDto result : list) {
			System.out.println(result);
		}
		
		

	}

}
