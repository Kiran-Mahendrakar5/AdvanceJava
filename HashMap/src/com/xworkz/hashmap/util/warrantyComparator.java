package com.xworkz.hashmap.util;

import java.util.Comparator;

import com.xworkz.hashmap.dto.ElectronicDto;

public class warrantyComparator implements Comparator<ElectronicDto> {

	@Override
	public int compare(ElectronicDto o1, ElectronicDto o2) {
		if(o1.getWarranty()<o2.getWarranty()) {
			return 1;
		}
		return -1;
	}

}
