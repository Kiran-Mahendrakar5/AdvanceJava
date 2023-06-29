package com.xworkz.mack;

public class StringRunner {
	
	public static void main(String[] args) {
		call("calling to u");
		bike("sold bike to u");
		tv("wating tv");
		
	}
	private static void tv(String nmae) {
		String name= nmae.replace('v', 's');
		System.out.println(name);
		
	}
	public static void bike(String namm) {
	String reee = 	namm.concat(" kiran");
	System.out.println(reee);
	
	
		
	}
	public static boolean call(String name) {
	boolean ref = 	name.endsWith("u");
	System.out.println(ref);
		return true;
		
	}

}
