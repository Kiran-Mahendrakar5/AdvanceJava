package com.xworkz.hashmap.util;

import java.util.Comparator;

import com.xworkz.hashmap.dto.ElectronicDto;

public class PriceComparator implements Comparator<ElectronicDto>{

	@Override
	public int compare(ElectronicDto o1, ElectronicDto o2) {
		if(o1.getPrice()>o2.getPrice()) {
			return 1;
		}
		return -1;
	}

}
