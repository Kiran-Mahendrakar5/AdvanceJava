package com.xworkz.hashmap.dto;

public class ElectronicDto {
	
	private String name;
	private int price;
	private int date;
	private int warranty;
	
	public ElectronicDto(String name, int price, int date, int warranty) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "ElectronicDto [name=" + name + ", price=" + price + ", date=" + date + ", warranty=" + warranty + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
	
	
	

}
