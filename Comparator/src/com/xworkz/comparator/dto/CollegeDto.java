package com.xworkz.comparator.dto;

public class CollegeDto implements Comparable<CollegeDto> {
	
	private String name;
	private String location;
	private int fees;
	
	
	@Override
	public String toString() {
		return "College [name=" + name + ", location=" + location + ", fees=" + fees + "]";
	}


	public CollegeDto(String name, String location, int fees) {
		super();
		this.name = name;
		this.location = location;
		this.fees = fees;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getFees() {
		return fees;
	}


	public void setFees(int fees) {
		this.fees = fees;
	}


	@Override
	public int compareTo(CollegeDto o) {
		if(getLocation().length()<o.getLocation().length()) {
			return 1;
		}
		return -1;
	}
	
	
	

}
