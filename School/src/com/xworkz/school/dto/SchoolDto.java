package com.xworkz.school.dto;

public class SchoolDto {
	
	private String name;
	private String location;
	private int fee;
	private int classRomm;
	
	public SchoolDto(String name, String location, int fee, int classRomm) {
		super();
		this.name = name;
		this.location = location;
		this.fee = fee;
		this.classRomm = classRomm;
	}
	@Override
	public String toString() {
		return "SchoolDto [name=" + name + ", location=" + location + ", fee=" + fee + ", classRomm=" + classRomm + "]";
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
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getClassRomm() {
		return classRomm;
	}
	public void setClassRomm(int classRomm) {
		this.classRomm = classRomm;
	}
	
	
	
	

}
