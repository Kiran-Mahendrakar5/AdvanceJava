package com.xworkz.methodObject;

public class finalize {

	public static void main(String[] args) {

		finalize obj = new finalize();
		System.out.println(obj.hashCode());

		obj = null;
		System.gc();
		System.out.println("ends of garbage collection");

	}
	
 }
