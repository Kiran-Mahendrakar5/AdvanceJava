package com.xworkz.mpractice.dto;

public class mobileDto implements Comparable<mobileDto> {
	private String brand;
	private int price;

	public mobileDto(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "mobileDto [brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(mobileDto o) {
		if(getPrice()>o.getPrice()) {
			return 1;
		}else {
			return -1;
		}
		
	}

}
