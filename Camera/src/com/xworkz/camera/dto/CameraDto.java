package com.xworkz.camera.dto;

public class CameraDto {

	private String brand;
	private String color;
	private int price;
	private float rating;

	public CameraDto(String brand, String color, int price, float rating) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "CameraDto [brand=" + brand + ", color=" + color + ", price=" + price + ", rating=" + rating + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

}
