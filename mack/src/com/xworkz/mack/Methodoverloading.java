package com.xworkz.mack;

public class Methodoverloading {
	public static void main(String[] args) {
		
		demo(125);
		demo(145);
		demo(65.68f);
		demo("elephants");
		
	}


	public static void demo(byte number) {
		System.out.println(number);
		
	}

	public static void demo(short student) {
	System.out.println(student);
		
	}
	
	public static void demo(float percentage) {
		System.out.println(percentage);
	} 
	public static void demo(String name) {
		System.out.println(name);
	}

	

}
