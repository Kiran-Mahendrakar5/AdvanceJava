package com.xworkz.mack;

public class parameterize {

	int value;
	String name;
	
	public parameterize(int valve,String name) {
		this.value=value;
		this.name=name;
		
	}
	public static void main(String[] args) {
		parameterize ref = new parameterize(6 ,"kiran");
		System.out.println(ref.value);
		System.out.println(ref.name);
	}
}
